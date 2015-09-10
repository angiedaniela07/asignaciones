/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import Vistas.FrmAsignaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Sala221
 */
public class AsignacionesModelo extends Conexion{
    
   
    public void cargarcombousuario(JComboBox listadouser){
      
        
        try {
//            
           Statement st=getConexion().createStatement();
           ResultSet rs=st.executeQuery("select concat_ws(' ',PrimNomb,SeguNomb,PrimApell,SeguApell) as 'listausuario' from terceros t, usuarios u where t.NumeDocu = u.NumeDocu and u.EstaUsua = 'ACTIVO' order by NombUsua;");
           
           while(rs.next()){
             listadouser.addItem(rs.getString(1));
           }
           
           
        }catch (SQLException ex) {
            Logger.getLogger(FrmAsignaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void mostrardocumento(JTextField docu){
    
        
    
    }
    
    
    
    
}
