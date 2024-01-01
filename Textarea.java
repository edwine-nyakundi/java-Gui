import java.awt.*;

class Textarea{
    public static void main(String[] args) {
        Frame f5=new Frame();
        TextArea area1=new TextArea("welcome visitor write your contribution");
        area1.setBounds(60,30,500,250);
        f5.add(area1);
        f5.setSize(500,500);
        f5.setLayout(null);
        f5.setVisible(true);
    }
}