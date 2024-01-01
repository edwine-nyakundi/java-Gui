
import java.awt.*;

class Panels{
    public static void main(String[]args){
        Frame f8=new Frame("PANELS||BY ENGINEER EDWINE.");
        Panel p1=new Panel();
        p1.setBounds(40,80,100,200);
        p1.setBackground(Color.yellow);
        Button btn1=new     Button("yes");
        btn1.setBounds(500, 70, 80, 30);
        btn1.setBackground(Color.green);
        Button btn2=new Button("NO");
        btn2.setBounds(100,90 , 80, 30);
        btn2.setBackground(Color.red);
        p1.add(btn1);
        p1.add(btn2);
        f8.add(p1);
        f8.setSize(800,400);
        f8.setLayout(null);
        f8.setVisible(true);


    }
}