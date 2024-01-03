import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyButton() {

        ImageIcon imageIcon= new ImageIcon(new ImageIcon("src/thumbs.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        ImageIcon imageIcon1= new ImageIcon(new ImageIcon("src/witchhat.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        label= new JLabel();
        label.setIcon(imageIcon1);
        label.setBounds(150,250,250,100);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.setText("click here");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-1);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){
            label.setVisible(true);
            System.out.println("button pressed");
        }
    }






}





