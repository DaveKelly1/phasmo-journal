package ghosts.Buttons;

import javax.swing.Action;
import javax.swing.JButton;

import ghosts.Demon;

public class demonButton {
    private JButton demonButton;
    private Demon demon;

    public demonButton(
        String firstText, String secondText){

        }

    demonButton=new JButton("Demon");demonButton.setBounds(10,80,75,25);
    panel.add(demonButton);demonButton.addActionListener(new ActionListener(){

    public void actionPerformed(Action e) {
        String first = firstText;
        String second = secondText;
        first = first.trim();
        second = second.trim();
        first = first.toUpperCase();
        second = second.toUpperCase();
        demon.checkGhost(first, second);
        journalText.setText("Evidence left for Demon is " + demon.removeGhost(first, second));
    }
});

}
}
