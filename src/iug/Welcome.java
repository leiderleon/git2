package iug;

import javax.swing.*;

public class Welcome {
    // creacion de componentes
    private JPanel Bienvenido;
    private JLabel saludo;
    private JPanel Welcome;

    // ejecuta init
    public Welcome(){
        init();
    }

    public void setNombre(String nombre){
        saludo.setText("Bienvenido "+nombre);
    }

    // configuracion de los componentes
    private void init(){
        // configuracion de la vista
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Bienvenido");
        jFrame.setVisible(true);
        jFrame.add(Bienvenido);
    }
}
