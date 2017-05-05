/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojasdevida;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class VentanaPrincipal extends JFrame {

    private Hoja hoja;
    
    private JMenuBar menuBar;
    
    public VentanaPrincipal() {
        setTitle("Hojas de Visa");
        setSize(800, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        menuBar = new JMenuBar();
        
        
        hoja = new Hoja();
        hoja.setBounds(10, 10, 775, 550);
        add(hoja);
        
        setVisible(true);
    }
    
    
    
    
}
