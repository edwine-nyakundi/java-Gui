import java.awt.*;
class CheckBox{
public static void main (String[]args){
    Frame f6=new Frame("CheckBox");
    Checkbox ch1=new Checkbox(" MAN U",true);
    ch1.setBounds(100, 100, 60, 60);
    Checkbox ch2=new Checkbox("ARSENAL");
    ch2.setBounds(100,150,60,60);
    Checkbox ch3=new Checkbox("MAN CITY");
    ch3.setBounds(100,200,60,60);
    f6.add(ch1);
    f6.add(ch2);
    f6.add(ch3);
    f6.setSize(500,500);
    f6.setLayout(null);
    f6.setVisible(true);

}
}