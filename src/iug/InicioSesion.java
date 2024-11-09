package iug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion {
    private JTextField tfcc;
    private JTextField textFieldPass;
    private JButton btnL;
    private JPanel main;
    private JPanel login;
    private JPasswordField tfpass;

    public InicioSesion(){
        init();
    }
    private void init(){

        Integer cc = 1116789890;
        String password = "pass5";

        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Ejercicio git 2");
        jFrame.setVisible(true);
        jFrame.add(main);

        tfcc.setText(String.valueOf(cc));
        tfpass.setText(password);


        btnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Welcome n = new Welcome();
                jFrame.setVisible(false);
            }
        });
    }
}
