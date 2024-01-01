import java.awt.*;
public class Labeldemo1 {
    public static void main(String[] args) {
        Frame f4=new Frame("labes study");
        Label l1=new Label("marktday.com");
        l1.setBounds(30,50 , 600, 90);
        Label l2=new Label("karuprogramming.web.app");
        l2.setBounds(30,50 , 600, 90);
        f4.add(l1);
        f4.add(l2);
        f4.setSize(500, 500);
        f4.setLayout(null);
        f4.setVisible(true);


    }
    
}
