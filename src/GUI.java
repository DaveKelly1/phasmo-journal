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
	
	private JLabel label;
	private JLabel message;
	private JLabel first;
	private JLabel second;
	private JLabel conc;
	private JLabel test;
	private JLabel test2;
	
	private JButton firstButton;
	private JTextField firstText;
	
	private JButton secondButton;
	private JTextField secondText;
	
	private JFrame frame;
	private JPanel panel;
	private journal journal;
	
	private Banshee banshee;
	private Demon demon;
	
	public GUI() {
	
	frame = new JFrame("Journal");
	panel = new JPanel();
	frame.setSize(500,300);
	frame.add(panel);
	frame.setTitle("Our GUI");
	
	label = new JLabel("Welcome to my search list. Please type below the evidence you have found so far");
	panel.add(label);
	
	//FIRST
	//First piece of evidence
	first = new JLabel("First piece of evidence: ");
	first.setBounds(10, 20, 200, 25);
	panel.add(first);
	
	//Text for first piece of evidence
	firstText = new JTextField(" ");
	firstText.setBounds(175, 20, 200, 25);
	panel.add(firstText);
	
	//Button for first piece of evidence
	//firstButton = new JButton("Submit");
	//firstButton.setBounds(400, 20, 75, 25);
	//panel.add(firstButton);
	//firstButton.addActionListener(this);
	
	//SECOND
	//Second piece of evidence
	second = new JLabel("Second piece of evidence");
	second.setBounds(10, 50, 200, 25);
	panel.add(second);
	
	//Text for second piece of evidence
	secondText = new JTextField(" ");
	secondText.setBounds(175, 50, 200, 25);
	panel.add(secondText);
	
	//Button for second piece of evidence
	secondButton = new JButton("Submit");
	secondButton.setBounds(10, 80, 75, 25);
	secondButton.addActionListener(this);
	panel.add(secondButton);
	
	//Label for two pieces of evidence
	conc = new JLabel("");
	conc.setBounds(10, 110, 500, 25);
	panel.add(conc);
	
	//Label for two pieces of evidence
		test = new JLabel("");
		test.setBounds(10, 130, 500, 25);
		panel.add(test);
		
		test2 = new JLabel("");
		test2.setBounds(10, 160, 500, 25);
		panel.add(test2);
	
	message = new JLabel("Evidence left to find is: ");
	panel.add(message);
	
	
	panel.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true); 
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String first = firstText.getText();
		String second = secondText.getText();	
		first = first.trim();
		second = second.trim();
		first = first.toUpperCase();
		second = second.toUpperCase();
		
		conc.setText("The evidence so far is " + first + " and " + second);
		banshee = new Banshee();
		demon = new Demon();
		
		if(banshee.checkBanshee(first, second)== true) {
		test.setText("Evidence left for Banshee is " + banshee.removeBanshee(first, second));
		}
		
		else if(demon.checkDemon(first, second)== true) {
			test.setText("Evidence left for Demon is " + demon.removeDemon(first, second));
		}
		
	}
}


