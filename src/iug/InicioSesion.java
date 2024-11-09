package iug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion {
    // Creacion de componentes
    private JTextField tfcc;
    private JButton btnL;
    private JPanel main;
    private JPanel login;
    private JPasswordField tfPassword;

    // Ejecuta init
    public InicioSesion(){
        init();
    }
    // configuracion de los componentes
    private void init(){

        Integer cc = 1116789890;
        String password = "pass5";

        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Ejercicio git 2");
        jFrame.setVisible(true);
        jFrame.add(main);

        tfcc.setText(String.valueOf(cc));
        tfPassword.setText(password);

        // Boton de Validacion
        btnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validar que no esté vacio
                if (tfcc.getText().isEmpty() || tfPassword.getPassword().length == 0){
                    tfcc.setText("");
                    tfPassword.setText("");
                }
                else {
                    // Validar que sean correctos los datos
                    char[] p = tfPassword.getPassword();
                    String validarPass = String.valueOf(p);

                    if (Integer.valueOf(tfcc.getText()).equals(cc) && validarPass.equals(password)){
                        System.out.println("Correcto");
                        Welcome n = new Welcome();
                        jFrame.setVisible(false);
                    }
                    else {
                        System.out.println("Incorrecto");
                    }
                }
            }
        });
    }
}
