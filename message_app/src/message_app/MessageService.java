/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message_app;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Candela
 */
public class MessageService {
    
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        Message registro = new Message("", "", "");
        registro.setMessage(mensaje);
        registro.setAutor_message(nombre);
        MessageDAO.createMessageDB(registro);
        
    }
    
    public static void listMessage(){
        Conexion db_connect = new Conexion();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try(Connection conexion = db_connect.get_connection())  {        
            String query="SELECT * FROM messages";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_message"));
                System.out.println("Mensaje: "+rs.getString("message"));
                System.out.println("Autor: "+rs.getString("author"));
                System.out.println("Fecha: "+rs.getString("date"));
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("no se pudieron recuperar los mensajes");
            System.out.println(e);
        }
        
    }
    public static void deleteMessages(){
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje= sc.nextInt();
        MessageDAO.deleteMessageDB(id_mensaje);
        
    }
    
    public static void updateMessages(){
         Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje= sc.nextInt();
        Message actualizacion = new Message("", "", "");
        actualizacion.setId_message(id_mensaje);
        actualizacion.setMessage(mensaje);
        MessageDAO.updateMessageDB(actualizacion);
        
    }
    
}
