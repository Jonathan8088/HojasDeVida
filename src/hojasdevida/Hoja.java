/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojasdevida;

import com.sun.javafx.menu.CheckMenuItemBase;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.control.CheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.io.*;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Jonathan
 */
public class Hoja extends JPanel implements ActionListener, ItemListener{

    private static final String ACEPTAR = "ACEPTAR";
    
    private static final String IMAGEN = "IMAGEN";
    /**
     * etiqueta que mostrara el mensaje imagen
     */
    private JLabel JLimagen;
     /**
     * area donde sera escrita la cedula
     */
    private JTextArea JTcedula;
    /**
     * etiqueta que mostrara el mensaj cedula
     */
    private JLabel JLcedula;
     /**
     * area donde sera escrito el correo
     */
    private JTextArea JTcorreo;
    /**
     * etiqueta que mostrara el mensaje correo
     */
    private JLabel Jlcorreo;
     /**
     * area donde sera escrito el nombre
     */
    private JTextArea JTnombre;
    /**
     * etiqueta que mostrara el mensaje nombre
     */
    private JLabel JLnombre;
    /**
     * etiqueta que mostrara el mensaje profesion
     */
    private JLabel JLprofesion;
    /**
     * etiqueta que mostrara el mensaje genero
     */
    private JLabel JLgenero;
     /**
     * area donde sera escrita la fecha de nacimiento
     */
    private JTextArea JTfechaNacDia;
    /**
     * etiqueta que mostrara el mensaje fecha de nacimiento
     */
    private JTextArea JTfechaNacMes;
           
    private JTextArea JTfechaNacAnio;
    
    private JLabel JLfechaNac;
    
    private Profesion profesion;
    
    private JButton btnAceptar;
    
    private JButton btnImagen;
    
    JCheckBox cbF,cbM;
    
    private Datos datos;
    
    File archivo;
    
    public Hoja() {
        setBackground(Color.lightGray);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(null);
        
        JLimagen = new JLabel("Imagen:");
        JLimagen.setBounds(20, 40, 100, 20);
        add(JLimagen);
        
        btnImagen = new JButton( "Seleccionar" );
        btnImagen.setActionCommand( IMAGEN );
        btnImagen.addActionListener(this);
        btnImagen.setBounds(120, 40, 150, 20);
        add( btnImagen );
        
        
        JLcedula = new JLabel ("Cedula:");
        JLcedula.setBounds(20, 80, 100, 20);
        add(JLcedula);
        
        JTcedula = new JTextArea();
        JTcedula.setBounds(120, 80, 150, 20);
        add(JTcedula);
        
        Jlcorreo = new JLabel("Correo:");
        Jlcorreo.setBounds(20, 120, 100, 20);
        add(Jlcorreo);
        
        JTcorreo = new JTextArea();
        JTcorreo.setBounds(120, 120, 150, 20);
        add(JTcorreo);
        
        JLnombre = new JLabel("Nombre:");
        JLnombre.setBounds(20, 160, 100, 20);
        add(JLnombre);
        
        JTnombre = new JTextArea();
        JTnombre.setBounds(120, 160, 150, 20);
        add(JTnombre);
        
        JLprofesion = new JLabel("Profesion:");
        JLprofesion.setBounds(20, 200, 100, 20);
        add(JLprofesion);
        
        JComboBox profesion = new JComboBox(Profesion.values());
        profesion.setBounds(120, 200, 150, 20);
        add(profesion);
        
        JLgenero = new JLabel("Genero:");
        JLgenero.setBounds(20, 240, 100, 20);
        add(JLgenero);
        ButtonGroup grupo = new ButtonGroup();
        JRadioButton cbF = new JRadioButton("F");
        cbF.setBounds(120, 240, 40, 20);
        grupo.add(cbF);
        JRadioButton cbM = new JRadioButton("M");
        cbM.setBounds(160, 240, 40, 20);
        grupo.add(cbM);
        add(cbM);
        add(cbF);
        
        JLfechaNac = new JLabel("Fecha de nacimiento:");
        JLfechaNac.setBounds(20, 280, 150, 20);
        add(JLfechaNac);
        
        JLfechaNac = new JLabel("Dia:");
        JLfechaNac.setBounds(180, 280, 50, 20);
        add(JLfechaNac);
        JTfechaNacDia = new JTextArea();
        JTfechaNacDia.setBounds(180, 310, 30, 20);
        add(JTfechaNacDia);
        
        JLfechaNac = new JLabel("Mes:");
        JLfechaNac.setBounds(220, 280, 50, 20);
        add(JLfechaNac);
        JTfechaNacMes = new JTextArea();
        JTfechaNacMes.setBounds(220, 310, 30, 20);
        add(JTfechaNacMes);
        
        JLfechaNac = new JLabel("Año:");
        JLfechaNac.setBounds(260, 280, 50, 20);
        add(JLfechaNac);
        JTfechaNacAnio = new JTextArea();
        JTfechaNacAnio.setBounds(260, 310, 50, 20);
        add(JTfechaNacAnio);
        
        btnAceptar = new JButton("Aceptar");
        btnImagen.setActionCommand( ACEPTAR );
        btnImagen.addActionListener(this);
        btnAceptar.setBounds(180, 350, 100, 20);
        add(btnAceptar);
        
        try {
            
        } catch (Exception e) {
            
                
        }
    }//constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case ACEPTAR:{
                System.out.println("qww");
                JFileChooser file=new JFileChooser();
                file.showOpenDialog(this);
                
                break;
            }
                
            case IMAGEN:{
                System.out.println("asa");
                break;
            }
                
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
      
    
}//Hoja
