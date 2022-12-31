package ghosts.Buttons;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;

import ghosts.Demon;

public class demonButton {
    private JButton demonButton;
    private Demon demon;

    public Component constructBtn() {
        demonButton = new JButton("Demon");
        demonButton.setBounds(10, 80, 75, 25);
        return demonButton;
    }

    public void demonButton(JTextField firstText, JTextField secondText) {
        String first = firstText.toLowerCase().trim();
        String second = secondText.toLowerCase().trim();
        ;

        demonButton.addActionListener(new ActionListener() {

            public void actionPerformed(Action e) {
                demon.checkGhost(first, second);
            }

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub

            }
        });

    }
}
