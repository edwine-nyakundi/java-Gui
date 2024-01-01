import java.awt.*;
public class ButtonDemo2 {
    public static void main(String[] args) {
        Frame f1=new Frame("HOME PAGE==>BY ENGINEER EDWINE");
        Button b1=new Button("LOGIN");
        b1.setBounds(500, 600, 50, 100);
        f1.add(b1);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    
}
