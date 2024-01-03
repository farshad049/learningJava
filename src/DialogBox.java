import javax.swing.*;
import java.awt.*;

public class DialogBox {

    DialogBox(){

        /*JOptionPane.showMessageDialog(
                null,
                "this is a dialog box",
                "title",
                JOptionPane.PLAIN_MESSAGE
        );*/


        /*JOptionPane.showConfirmDialog(
                null,
                "this is the message",
                "this is the title",
                JOptionPane.YES_NO_CANCEL_OPTION
        );*/



        ImageIcon icon = new ImageIcon(new ImageIcon("src/icons100.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        String[] options= {"option1", "option2", "option3"};


        JOptionPane.showOptionDialog(
                null,
                "this is the message",
                "this is the title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                icon,
                options,
                0
        );



    }


}
