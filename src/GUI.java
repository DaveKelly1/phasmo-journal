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
		journalText.setBounds(10, 130, 500, 25);
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
		bansheeButton.setBounds(100, 80, 90, 25);
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
		goryoButton.setBounds(200, 80, 90, 25);
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
		jinnButton.setBounds(300, 80, 75, 25);
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

		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
	}
}


