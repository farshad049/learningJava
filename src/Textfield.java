import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textfield extends JFrame implements ActionListener {

    JTextField textField= new JTextField();
    Button button= new Button("submit");
    Textfield(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas" , Font.PLAIN, 18));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("type your name here"); // hint


        button.addActionListener(this);

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("welcome" + " " + textField.getText());
            textField.setEditable(false); // after clicking the button, the text field can not be edited
            button.setEnabled(false);
        }

    }


}
