/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
/**
 *
 * @author Johan Macias jmaciasb@unal.edu.co
 *         Omar
 *         Santiago
 */
public class MailBox {
   private ArrayList<Mail> content;

    public MailBox() {
        this.content = new ArrayList<>();
    }
    
    
    public boolean registrarMail(String content, Person sender, Person receiver){
       Mail mail = new Mail(content, sender, receiver);
       return (this.content.add(mail));
    }
 
}
