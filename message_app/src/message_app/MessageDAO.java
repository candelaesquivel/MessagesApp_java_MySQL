/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Candela
 */
public class MessageDAO {
   
     public static void createMessageDB(Message mensaje){
          Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection())  {
            PreparedStatement  ps=null;
            try{
                String query="INSERT INTO messages ( message, author ) VALUES (?,?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMessage());
                ps.setString(2, mensaje.getAutor_message());
                ps.executeUpdate();
                System.out.println("mensaje creado");
                
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void readMessageDB(){
        MessageDAO.readMessageDB();
    }
    
    public static void deleteMessageDB(int id_mensaje){
         Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection())  {
        PreparedStatement ps=null;
        
            try {
                String query="DELETE FROM messages WHERE id_message = ?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("el mensaje ha sido borrado");
            }catch(SQLException e) {
                System.out.println(e);
                 System.out.println("no se pudo borrar el mensaje");
            }
        
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void updateMessageDB(Message mensaje){
         Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection())  { 
        PreparedStatement ps=null;
        
            try{ 
                String query="UPDATE messages SET message = ? WHERE id_message = ?";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMessage());
                ps.setInt(2, mensaje.getId_message());
                ps.executeUpdate();
                System.out.println("mensaje editado correctamente");
            }catch(SQLException ex){ 
                System.out.println(ex);
                System.out.println("no se pudo actualizar el mensaje");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    
        
    }
}
