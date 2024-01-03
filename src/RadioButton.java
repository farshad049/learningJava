import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;


    RadioButton() {

        ImageIcon pizzaIcon = new ImageIcon(new ImageIcon("pizza.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
        ImageIcon hamburgerIcon = new ImageIcon(new ImageIcon("burger.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
        ImageIcon hotDogIcon = new ImageIcon(new ImageIcon("hot-dog.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));




        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hot dog");

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotDogButton.setIcon(hotDogIcon);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        frame.add(pizzaButton);
        frame.add(hamburgerButton);
        frame.add(hotDogButton);

        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pizzaButton) {
            System.out.println("you ordered pizza");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("you ordered hamburger");
        } else if (e.getSource() == hotDogButton) {
            System.out.println("you ordered hot dog");
        }
    }


}



