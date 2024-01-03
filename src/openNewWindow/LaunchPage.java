package openNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame= new JFrame();
    JButton myButton= new JButton("New Window");

    public LaunchPage(){
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        frame.add(myButton);
        frame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==myButton){
            frame.dispose(); // closes this page while opening the new one
            NewWindow myNewWindow= new NewWindow();
        }

    }



}
