import javax.swing.*;
import java.awt.*;

public class Gridlayout {

    Gridlayout(){
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10));


        frame.add(new JButton("button 1"));
        frame.add(new JButton("button 2"));
        frame.add(new JButton("button 3"));
        frame.add(new JButton("button 4"));
        frame.add(new JButton("button 5"));
        frame.add(new JButton("button 6"));
        frame.add(new JButton("button 7"));
        frame.add(new JButton("button 8"));
        frame.add(new JButton("button 9"));



        frame.setVisible(true);
    }


}
