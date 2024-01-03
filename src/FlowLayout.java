import javax.swing.*;
import java.awt.*;

public class FlowLayout {

    FlowLayout(){

        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));


        JPanel panel= new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);


        panel.add(new JButton("button 1"));
        panel.add(new JButton("button 2"));
        panel.add(new JButton("button 3"));
        panel.add(new JButton("button 4"));
        panel.add(new JButton("button 5"));
        panel.add(new JButton("button 6"));
        panel.add(new JButton("button 7"));
        panel.add(new JButton("button 8"));
        panel.add(new JButton("button 9"));
        panel.add(new JButton("button 10"));





        frame.add(panel);
        frame.setVisible(true);
    }



}
