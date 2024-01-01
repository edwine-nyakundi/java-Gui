
import java.awt.*;
public class Textfield {
    public static void main(String[] args) {
        Frame textField=new Frame("BY EDWINE");
        TextField text1,text2;
        text1=new TextField("WELCOME TO KENYA");
        text1.setBounds(10, 30, 100, 50);
        text2=new TextField("WELCOME TO MARKTDAY.COM");
        text2.setBounds(10, 300, 100, 50);
        textField.add(text1);
        textField.add(text2);
        textField.setSize(800, 800);
        textField.setLayout(null);
        textField.setVisible(true);



    }
}
