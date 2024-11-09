package iug;

import javax.swing.*;

public class Welcome {
    private JPanel Welcome;

    public Welcome(){
        init();
    }
    private void init(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Welcome");
        jFrame.setVisible(true);
        jFrame.add(Welcome);
    }
}
