/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message_app;

/**
 *
 * @author Candela
 */
public class Message {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;

 
    public Message(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }


    
    public int getId_message() {
        return id_mensaje;
    }

    public void setId_message(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMessage() {
        return mensaje;
    }

    public void setMessage(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_message() {
        return autor_mensaje;
    }

    public void setAutor_message(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_message() {
        return fecha_mensaje;
    }

    public void setFecha_message(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
}
