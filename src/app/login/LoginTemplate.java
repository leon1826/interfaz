/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Leon1
 */
public class LoginTemplate extends JFrame{
    
    private JPanel pizquierda,pderecha;
    private JLabel ltitulo,leslogan,ltitulologin,lnotificacion;
    private JTextField tNombreusuario;
    private JPasswordField tClavedeusuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar,bdos;
    private JCheckBox checkSi;
    private ButtonGroup grupo;
    private Color azul,nregrotransparente;
    private Font fontTprincipal,fontTlogin,fontsubtitulo;
    private Cursor cmano;
    private Border bordeinferior,borde2,borde3;
    private ImageIcon ifondo,ilogo,iusuario,iaux;
    private JLabel lfondo;
    
    public LoginTemplate(){
        super("Login de Usuario");
        //colores
        azul= new Color(60,78,120);
        nregrotransparente = new Color(80,80,80,0);
        fontTprincipal = new Font("Times New Roman",Font.BOLD,15);//fuente,estilo,size
        cmano = new Cursor(Cursor.HAND_CURSOR);
        bordeinferior = BorderFactory.createLineBorder(azul,2,true);
        borde2 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY,Color.CYAN,Color.WHITE,Color.DARK_GRAY);
        borde3 = BorderFactory.createMatteBorder(0,0,2,0,azul);
        
        ifondo = new ImageIcon("resources/img/Xbox_one_logo.svg.png");
        iaux =new ImageIcon(ifondo.getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING));
        
        pizquierda=new JPanel();
        pizquierda.setSize(600,500);
        pizquierda.setLocation(0, 0);
        pizquierda.setLayout(null); 
        pizquierda.setBackground(Color.BLUE);
        this.add(pizquierda);
        
        pderecha=new JPanel();
        pderecha.setSize(400,500);
        pderecha.setLocation(600, 0);
        pderecha.setLayout(null);
        pderecha.setBackground(Color.WHITE);
        this.add(pderecha);
        
        ltitulo=new JLabel("Login de Usuario");
        ltitulo.setBounds(100, 20, 200, 30);
        ltitulo.setForeground(Color.white);
        ltitulo.setBorder(borde2);
        pizquierda.add(ltitulo);
        
        lfondo=new JLabel();
        lfondo.setBounds(100, 100, 200, 500);
        lfondo.setIcon(iaux);
        pizquierda.add(lfondo);
        
        leslogan= new JLabel("Login de Usuario");
        leslogan.setSize(130,20);
        leslogan.setLocation((pderecha.getWidth()-leslogan.getWidth())/2,40);
        leslogan.setForeground(Color.white);
        leslogan.setFont(fontTlogin);
        pderecha.add(leslogan);
        
        tNombreusuario = new JTextField();
        tNombreusuario.setSize(300,40);
        tNombreusuario.setLocation((pderecha.getWidth()-tNombreusuario.getWidth())/2, 40);
        tNombreusuario.setForeground(Color.DARK_GRAY);
        tNombreusuario.setBackground(Color.white);
        tNombreusuario.setCaretColor(Color.BLUE);
        tNombreusuario.setBorder(bordeinferior);
        tNombreusuario.setHorizontalAlignment(SwingConstants.CENTER);
        pderecha.add(tNombreusuario);
        
        tClavedeusuario = new JPasswordField();
        tClavedeusuario.setSize(300,40);
        tClavedeusuario.setLocation((pderecha.getWidth()-tClavedeusuario.getWidth())/2, 240);
        tClavedeusuario.setForeground(Color.DARK_GRAY);//
        tClavedeusuario.setBackground(Color.white);
        tClavedeusuario.setCaretColor(Color.BLUE);//cuando parpadea el color
        tClavedeusuario.setHorizontalAlignment(SwingConstants.CENTER);
        pderecha.add(tClavedeusuario);
        
        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.setSize(220,30);
        cbTipoUsuario.setLocation((pderecha.getWidth()-cbTipoUsuario.getWidth())/2, 185);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.white);
        ((JLabel)cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pderecha.add(cbTipoUsuario);
        
        bEntrar = new JButton();
        bEntrar.setSize(220,30);
        bEntrar.setLocation((pderecha.getWidth()-bEntrar.getWidth())/2, 300);
        bEntrar.setBackground(Color.CYAN);
        bEntrar.setForeground(Color.white);
        bEntrar.setCursor(cmano);
        bEntrar.setFocusable(false);
        pderecha.add(bEntrar);
        
        
        bdos = new JButton();
        bdos.setSize(220,30);
        bdos.setLocation((pderecha.getWidth()-bEntrar.getWidth())/2, 300);
        bdos.setContentAreaFilled(false);//transparente
        bdos.setBorder(null);
        bdos.setFocusable(false);
        bdos.setIcon(iaux);
        pizquierda.add(bdos);
        
        
        checkSi = new JCheckBox();
        checkSi.setSize(45,25);
        
         
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
}
