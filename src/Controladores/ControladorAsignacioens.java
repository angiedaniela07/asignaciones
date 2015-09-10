/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelos.AsignacionesModelo;
import Vistas.FrmAsignaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sala221
 */
public class ControladorAsignacioens implements ActionListener,MouseListener {
    FrmAsignaciones vtnAsignaciones;
    AsignacionesModelo modelo = new AsignacionesModelo();
 public enum AccionMVC{
        __ASIGNAR_,
        __REASIGNAR_,
        __USERSELECTITEM_
    }
     public ControladorAsignacioens(FrmAsignaciones vistas){
        this.vtnAsignaciones = vistas;
        
        this.modelo.cargarcombousuario(this.vtnAsignaciones.jComboListado);
    } 
     
   
    
   public void iniciar(){
//        try {
//            UIManager.setLookAndFeel("com.sum.java.swing.plaf.windows." + "WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vtnAsignaciones);
            vtnAsignaciones.setVisible(true);
//        } catch (UnsupportedLookAndFeelException ex) {}
//          catch (ClassNotFoundException ex) {}
//          catch (InstantiationException ex) {}
//          catch (IllegalAccessException ex) {} 
       
        
         this.vtnAsignaciones.jBTAsignar.setActionCommand("__ASIGNAR_");
          this.vtnAsignaciones.jBTAsignar.addActionListener(this);
        
          this.vtnAsignaciones.jBTReasignar.setActionCommand("__REASIGNAR_");
          this.vtnAsignaciones.jBTReasignar.addActionListener(this);
        
          this.vtnAsignaciones.jComboListado.setActionCommand("__USERSELECTITEM_");
          this.vtnAsignaciones.jComboListado.addActionListener(this);
         
          this.vtnAsignaciones.jTblListado.addMouseListener(this);
          this.vtnAsignaciones.jTblListado.setModel(new DefaultTableModel());
        
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(AccionMVC.valueOf(e.getActionCommand())){
           
            case __USERSELECTITEM_: {
            
                
                
            }          
       }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
   public void mouseEntered(MouseEvent e) {}
    @Override
   public void mouseExited(MouseEvent e) {}
   

   
   
   
   
    
     
}
