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

public class GUI implements ActionListener {

	private JLabel welcome;
	private JLabel firstEvidenceText;
	private JLabel secondEvidenceText;
	private JLabel conc;
	private JLabel journalText;

	private JButton bansheeButton;
	private JButton goryoButton;
	private JButton demonButton;
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

	//GHOSTS
	private Banshee banshee;
	private Demon demon;
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

	public GUI() {

		banshee = new Banshee();
		demon = new Demon();
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
		frame.setSize(500,300);
		frame.add(panel);
		frame.setTitle("Dave's Journal");

		welcome = new JLabel("Welcome to my search list. Please type below the evidence you have found so far");
		panel.add(welcome);

		//FIRST
		//First piece of evidence
		firstEvidenceText = new JLabel("First piece of evidence: ");
		firstEvidenceText.setBounds(10, 20, 200, 25);
		panel.add(firstEvidenceText);

		//Text for first piece of evidence
		firstText = new JTextField(" ");
		firstText.setBounds(175, 20, 200, 25);
		panel.add(firstText);

		//SECOND
		//Second piece of evidence
		secondEvidenceText = new JLabel("Second piece of evidence");
		secondEvidenceText.setBounds(10, 50, 200, 25);
		panel.add(secondEvidenceText);

		//Text for second piece of evidence
		secondText = new JTextField(" ");
		secondText.setBounds(175, 50, 200, 25);
		panel.add(secondText);

		//Label for two pieces of evidence
		conc = new JLabel("");
		conc.setBounds(10, 110, 500, 25);
		panel.add(conc);

		//Label for two pieces of evidence
		journalText = new JLabel("");
		journalText.setBounds(10, 240, 500, 25);
		panel.add(journalText);

		//BUTTONS

		//Button for Demon
		demonButton = new JButton("Demon");
		demonButton.setBounds(10, 80, 75, 25);
		panel.add(demonButton);
		demonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();	
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				demon.checkDemon(first, second);
				journalText.setText("Evidence left for Demon is " + demon.removeDemon(first, second));
			}
		});

		//Button for Banshee
		bansheeButton = new JButton("Banshee");
		bansheeButton.setBounds(90, 80, 90, 25);
		panel.add(bansheeButton);
		bansheeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = firstText.getText();
				String second = secondText.getText();	
				first = first.trim();
				second = second.trim();
				first = first.toUpperCase();
				second = second.toUpperCase();
				banshee.checkBanshee(first, second);
				journalText.setText("Evidence left for Banshee is " + banshee.removeBanshee(first, second));
			}
		});

		//Button for Goryo
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
				goryo.checkGoryo(first, second);
				journalText.setText("Evidence left for Goryo is " + goryo.removeGoryo(first, second));
			}
		});

		//Button for Jinn
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
				jinn.checkJinn(first, second);
				journalText.setText("Evidence left for Jinn is " + jinn.removeJinn(first, second));
			}
		});

		//Button for Hantu
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
				hantu.checkHantu(first, second);
				journalText.setText("Evidence left for Hantu is " + hantu.removeHantu(first, second));
			}
		});

		//Button for Phantom
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
				phantom.checkPhantom(first, second);
				journalText.setText("Evidence left for Phantom is " + phantom.removePhantom(first, second));
			}
		});

		//Button for Onryo
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
				onryo.checkOnryo(first, second);
				journalText.setText("Evidence left for Onryo is " + onryo.removeOnryo(first, second));
			}
		});

		//Button for Poltergeist
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
				poltergeist.checkPoltergeist(first, second);
				journalText.setText("Evidence left for Poltergeist is " + poltergeist.removePoltergeist(first, second));
			}
		});

		//Button for Shade
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
				shade.checkShade(first, second);
				journalText.setText("Evidence left for Shade is " + shade.removeShade(first, second));
			}
		});

		//Button for Spirit
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
				spirit.checkSpirit(first, second);
				journalText.setText("Evidence left for Spirit is " + spirit.removeSpirit(first, second));
			}
		});

		//Button for The Mimic
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
				theMimic.checkTheMimic(first, second);
				journalText.setText("Evidence left for The Mimic is " + theMimic.removeTheMimic(first, second));
			}
		});

		//Button for Yokai
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
				yokai.checkYokai(first, second);
				journalText.setText("Evidence left for Yokai is " + yokai.removeYokai(first, second));
			}
		});

		//Button for Wraith
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
				wraith.checkWraith(first, second);
				journalText.setText("Evidence left for Wraith is " + wraith.removeWraith(first, second));
			}
		});

		//Button for Yurei
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
				yurei.checkYurei(first, second);
				journalText.setText("Evidence left for Yurei is " + yurei.removeYurei(first, second));
			}
		});

		//Button for Mare
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
				mare.checkMare(first, second);
				journalText.setText("Evidence left for Mare is " + mare.removeMare(first, second));
			}
		});

		//Button for Myling
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
				myling.checkMyling(first, second);
				journalText.setText("Evidence left for Myling is " + myling.removeMyling(first, second));
			}
		});

		//Button for Obake
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
				obake.checkObake(first, second);
				journalText.setText("Evidence left for Obake is " + obake.removeObake(first, second));
			}
		});

		//Button for Oni
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
				oni.checkOni(first, second);
				journalText.setText("Evidence left for Oni is " + oni.removeOni(first, second));
			}
		});

		//Button for Raiju
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
				raiju.checkRaiju(first, second);
				journalText.setText("Evidence left for Raiju is " + raiju.removeRaiju(first, second));
			}
		});

		//Button for Revenant
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
				revenant.checkRevenant(first, second);
				journalText.setText("Evidence left for Revenant is " + revenant.removeRevenant(first, second));
			}
		});

		//Button for The Twins
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
				theTwins.checkTheTwins(first, second);
				journalText.setText("Evidence left for The Twins is " + theTwins.removeTheTwins(first, second));
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


