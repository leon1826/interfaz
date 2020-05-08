/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.VentanPrincipal;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Leon1
 */
public class VentanaPrincipal extends JFrame{
    
    private JButton boton1;
    private JTextField nombre;

    public VentanaPrincipal() {
        this.setTitle("Ventana Principal");
        this.setSize(800,800);
        this.getContentPane().setBackground(Color.blue);
        this.setLocationRelativeTo(this);
        //*.setUndecorated(true);*/
        this.setVisible(true);
    }
    
    public void saludar(){
        String saludo = "Hola bienvenido";
        System.out.println(saludo);
    }
    
}
