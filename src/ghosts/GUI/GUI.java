package ghosts.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ghosts.Banshee;
import ghosts.Demon;
import ghosts.Goryo;
import ghosts.Hantu;
import ghosts.Jinn;
import ghosts.Mare;
import ghosts.Myling;
import ghosts.Obake;
import ghosts.Oni;
import ghosts.Onryo;
import ghosts.Phantom;
import ghosts.Poltergeist;
import ghosts.Raiju;
import ghosts.Revenant;
import ghosts.Shade;
import ghosts.Spirit;
import ghosts.TheMimic;
import ghosts.TheTwins;
import ghosts.Wraith;
import ghosts.Yokai;
import ghosts.Yurei;
import ghosts.Buttons.demonButton;

public class GUI implements ActionListener {

	private JLabel welcome;
	private JLabel firstEvidenceText;
	private JLabel secondEvidenceText;
	private JLabel conc;
	private JLabel journalText;

	private JButton bansheeButton;
	private JButton goryoButton;
	private JButton jinnButton;
	private JButton hantuButton;
	private JButton phantomButton;
	private JButton onryoButton;
	private JButton poltergeistButton;
	private JButton shadeButton;
	private JButton spiritButton;
	private JButton theMimicButton;
	private JButton yokaiButton;
	private JButton wraithButton;
	private JButton yureiButton;
	private JButton mareButton;
	private JButton mylingButton;
	private JButton obakeButton;
	private JButton oniButton;
	private JButton raijuButton;
	private JButton revenantButton;
	private JButton theTwinsButton;

	private JTextField firstText;
	private JTextField secondText;

	private JFrame frame;
	private JPanel panel;

	// GHOSTS
	private Banshee banshee;
	private Goryo goryo;
	private Jinn jinn;
	private Hantu hantu;
	private Phantom phantom;
	private Onryo onryo;
	private Poltergeist poltergeist;
	private Shade shade;
	private Spirit spirit;
	private TheMimic theMimic;
	private Yokai yokai;
	private Wraith wraith;
	private Yurei yurei;
	private Mare mare;
	private Myling myling;
	private Obake obake;
	private Oni oni;
	private Raiju raiju;
	private Revenant revenant;
	private TheTwins theTwins;
	private demonButton demonBtn;

	public GUI() {

		banshee = new Banshee();
		goryo = new Goryo();
		phantom = new Phantom();
		hantu = new Hantu();
		jinn = new Jinn();
		onryo = new Onryo();
		poltergeist = new Poltergeist();
		shade = new Shade();
		spirit = new Spirit();
		theMimic = new TheMimic();
		yokai = new Yokai();
		wraith = new Wraith();
		yurei = new Yurei();
		mare = new Mare();
		myling = new Myling();
		obake = new Obake();
		oni = new Oni();
		raiju = new Raiju();
		revenant = new Revenant();
		theTwins = new TheTwins();

		frame = new JFrame("Journal");
		panel = new JPanel();
		frame.setSize(500, 300);
		frame.add(panel);
		frame.setTitle("Dave's Journal");

		welcome = new JLabel("Welcome to my search list. Please type below the evidence you have found so far");
		panel.add(welcome);

		// FIRST
		// First piece of evidence
		firstEvidenceText = new JLabel("First piece of evidence: ");
		firstEvidenceText.setBounds(10, 20, 200, 25);
		panel.add(firstEvidenceText);

		// Text for first piece of evidence
		firstText = new JTextField(" ");
		firstText.setBounds(175, 20, 200, 25);
		panel.add(firstText);

		// SECOND
		// Second piece of evidence
		secondEvidenceText = new JLabel("Second piece of evidence");
		secondEvidenceText.setBounds(10, 50, 200, 25);
		panel.add(secondEvidenceText);

		// Text for second piece of evidence
		secondText = new JTextField(" ");
		secondText.setBounds(175, 50, 200, 25);
		panel.add(secondText);

		// Label for two pieces of evidence
		conc = new JLabel("");
		conc.setBounds(10, 110, 500, 25);
		panel.add(conc);

		// Label for two pieces of evidence
		journalText = new JLabel("");
		journalText.setBounds(10, 240, 500, 25);
		panel.add(journalText);

		// BUTTONS

		// Button for Demon
		demonBtn = new demonButton();
		panel.add(demonBtn.constructBtn());
		demonBtn.demonButton(firstText, secondText);
		demonBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				demonBtn.checkGhost(firstText, secondText);
			}

		});

		// Button for Banshee
		bansheeButton = new JButton("Banshee");
		bansheeButton.setBounds(90, 80, 90, 25);
		panel.add(bansheeButton);
		bansheeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText().trim().toLowerCase();
				String second = secondText.getText().trim().toLowerCase();
				banshee.checkGhost(first, second);
				journalText.setText("Evidence left for Banshee is " + banshee.removeGhost(first, second));
			}
		});

		// Button for Goryo
		goryoButton = new JButton("Goryo");
		goryoButton.setBounds(185, 80, 90, 25);
		panel.add(goryoButton);
		goryoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				goryo.checkGhost(first, second);
				journalText.setText("Evidence left for Goryo is " + goryo.removeGhost(first, second));
			}
		});

		// Button for Jinn
		jinnButton = new JButton("Jinn");
		jinnButton.setBounds(280, 80, 75, 25);
		panel.add(jinnButton);
		jinnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				jinn.checkGhost(first, second);
				journalText.setText("Evidence left for Jinn is " + jinn.removeGhost(first, second));
			}
		});

		// Button for Hantu
		hantuButton = new JButton("Hantu");
		hantuButton.setBounds(360, 80, 75, 25);
		panel.add(hantuButton);
		hantuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				hantu.checkGhost(first, second);
				journalText.setText("Evidence left for Hantu is " + hantu.removeGhost(first, second));
			}
		});

		// Button for Phantom
		phantomButton = new JButton("Phantom");
		phantomButton.setBounds(440, 80, 90, 25);
		panel.add(phantomButton);
		phantomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				phantom.checkGhost(first, second);
				journalText.setText("Evidence left for Phantom is " + phantom.removeGhost(first, second));
			}
		});

		// Button for Onryo
		onryoButton = new JButton("Onryo");
		onryoButton.setBounds(10, 120, 75, 25);
		panel.add(onryoButton);
		onryoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				onryo.checkGhost(first, second);
				journalText.setText("Evidence left for Onryo is " + onryo.removeGhost(first, second));
			}
		});

		// Button for Poltergeist
		poltergeistButton = new JButton("Poltergeist");
		poltergeistButton.setBounds(90, 120, 100, 25);
		panel.add(poltergeistButton);
		poltergeistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				poltergeist.checkGhost(first, second);
				journalText.setText("Evidence left for Poltergeist is " + poltergeist.removeGhost(first, second));
			}
		});

		// Button for Shade
		shadeButton = new JButton("Shade");
		shadeButton.setBounds(195, 120, 75, 25);
		panel.add(shadeButton);
		shadeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				shade.checkGhost(first, second);
				journalText.setText("Evidence left for Shade is " + shade.removeGhost(first, second));
			}
		});

		// Button for Spirit
		spiritButton = new JButton("Spirit");
		spiritButton.setBounds(275, 120, 75, 25);
		panel.add(spiritButton);
		spiritButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				spirit.checkGhost(first, second);
				journalText.setText("Evidence left for Spirit is " + spirit.removeGhost(first, second));
			}
		});

		// Button for The Mimic
		theMimicButton = new JButton("The Mimic");
		theMimicButton.setBounds(355, 120, 100, 25);
		panel.add(theMimicButton);
		theMimicButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				theMimic.checkGhost(first, second);
				journalText.setText("Evidence left for The Mimic is " + theMimic.removeGhost(first, second));
			}
		});

		// Button for Yokai
		yokaiButton = new JButton("Yokai");
		yokaiButton.setBounds(460, 120, 75, 25);
		panel.add(yokaiButton);
		yokaiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				yokai.checkGhost(first, second);
				journalText.setText("Evidence left for Yokai is " + yokai.removeGhost(first, second));
			}
		});

		// Button for Wraith
		wraithButton = new JButton("Wraith");
		wraithButton.setBounds(10, 160, 75, 25);
		panel.add(wraithButton);
		wraithButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				wraith.checkGhost(first, second);
				journalText.setText("Evidence left for Wraith is " + wraith.removeGhost(first, second));
			}
		});

		// Button for Yurei
		yureiButton = new JButton("Yurei");
		yureiButton.setBounds(90, 160, 75, 25);
		panel.add(yureiButton);
		yureiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				yurei.checkGhost(first, second);
				journalText.setText("Evidence left for Yurei is " + yurei.removeGhost(first, second));
			}
		});

		// Button for Mare
		mareButton = new JButton("Mare");
		mareButton.setBounds(170, 160, 75, 25);
		panel.add(mareButton);
		mareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				mare.checkGhost(first, second);
				journalText.setText("Evidence left for Mare is " + mare.removeGhost(first, second));
			}
		});

		// Button for Myling
		mylingButton = new JButton("Myling");
		mylingButton.setBounds(250, 160, 75, 25);
		panel.add(mylingButton);
		mylingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				myling.checkGhost(first, second);
				journalText.setText("Evidence left for Myling is " + myling.removeGhost(first, second));
			}
		});

		// Button for Obake
		obakeButton = new JButton("Obake");
		obakeButton.setBounds(330, 160, 75, 25);
		panel.add(obakeButton);
		obakeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				obake.checkGhost(first, second);
				journalText.setText("Evidence left for Obake is " + obake.removeGhost(first, second));
			}
		});

		// Button for Oni
		oniButton = new JButton("Oni");
		oniButton.setBounds(410, 160, 75, 25);
		panel.add(oniButton);
		oniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				oni.checkGhost(first, second);
				journalText.setText("Evidence left for Oni is " + oni.removeGhost(first, second));
			}
		});

		// Button for Raiju
		raijuButton = new JButton("Raiju");
		raijuButton.setBounds(490, 160, 75, 25);
		panel.add(raijuButton);
		raijuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				raiju.checkGhost(first, second);
				journalText.setText("Evidence left for Raiju is " + raiju.removeGhost(first, second));
			}
		});

		// Button for Revenant
		revenantButton = new JButton("Revenant");
		revenantButton.setBounds(10, 200, 100, 25);
		panel.add(revenantButton);
		revenantButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				revenant.checkGhost(first, second);
				journalText.setText("Evidence left for Revenant is " + revenant.removeGhost(first, second));
			}
		});

		// Button for The Twins
		theTwinsButton = new JButton("The Twins");
		theTwinsButton.setBounds(115, 200, 100, 25);
		panel.add(theTwinsButton);
		theTwinsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				theTwins.checkGhost(first, second);
				journalText.setText("Evidence left for The Twins is " + theTwins.removeGhost(first, second));
			}
		});

		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
