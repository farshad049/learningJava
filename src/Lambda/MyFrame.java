package Lambda;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("button 1");
    JButton myButton2 = new JButton("button 2");
    public MyFrame(){
        myButton.setBounds(100, 100, 100, 100);
        myButton.addActionListener(
                (e -> {
                    System.out.println("you pressed the button");
                })
        );

        myButton2.setBounds(100, 200, 100, 100);
        myButton2.addActionListener(
                (e -> {
                    System.out.println("you pressed the second button");
                })
        );


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500 , 500);
        this.setLayout(null);


        this.add(myButton);
        this.add(myButton2);

        this.setVisible(true);
    }


}
