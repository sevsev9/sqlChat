package main.DATA;

import java.sql.Date;
import java.time.LocalDate;

public class Message {
    private String message;
    private String autor;       //autors username
    private String reciever;    //recievers username
    private Date sent;          //SQL Date for MYSQL Database compatibility

    public Message(String message, String autor, String reciever, Date sent) {
        this.message = message;
        this.autor = autor;
        this.reciever = reciever;
        this.sent = sent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }
}
