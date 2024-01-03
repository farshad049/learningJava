import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {

    Button button= new Button("submit");
    JCheckBox checkBox= new JCheckBox();

    ImageIcon checkBoxIcon = new ImageIcon(new ImageIcon("src/icons100.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
    ImageIcon textFieldIcon = new ImageIcon(new ImageIcon("src/witchhat.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));


    CheckBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false); //remove the border around
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 24));
        checkBox.setIcon(checkBoxIcon);
        checkBox.setSelectedIcon(textFieldIcon);

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            boolean isSelected= checkBox.isSelected();
            System.out.println(isSelected);
        }

    }
}
