package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClass extends JFrame {

    JButton button1 = new JButton("button#1");
    JButton button2 = new JButton("button#2");
    JButton button3 = new JButton("button#3");


    public AnonymousInnerClass() {
        button1.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

        button1.addActionListener(e ->
                System.out.println("button 1 was pressed")
        );

        button2.addActionListener(e ->
                System.out.println("button 2 was pressed")
        );
        button3.addActionListener(e ->
                System.out.println("button 3 ws pressed")
        );


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        this.setLayout(null);

        this.add(button1);
        this.add(button2);
        this.add(button3);


        this.setVisible(true);

    }
}
