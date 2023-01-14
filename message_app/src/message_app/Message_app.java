/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package message_app;


import java.util.Scanner;

/**
 *
 * @author Candela
 */
public class Message_app {
   
    public static void main(String[] args) {
        /**
       Conexion conexion = new Conexion();
       try(Connection cnx = conexion.get_connection()){
           System.out.println(cnx);
       }catch(Exception e ){
           System.out.println(e);
           
       }
       */
        Scanner sc = new Scanner(System.in);
       
       int opcion=0;
       
       do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    MessageService.createMessage();
          
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.deleteMessages();
                    break;
                case 4:
                    MessageService.updateMessages();
                    break;
                default:
                    break;
            }
           
       }while(opcion != 5);
        
       
    }
    
}
