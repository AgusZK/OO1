package ejercicio15;
import java.util.ArrayList;

public class Carpeta {
    public String nombre;
    public ArrayList<Email> emails;

    public Carpeta (String nombre){
        this.nombre = nombre;
        this.emails = new ArrayList<Email>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarMail(Email mail){
        this.emails.add(mail);
    }

    public void eliminarMail(Email mail){
        this.emails.remove(mail);
    }

    public  void mover (Email email, Carpeta carpeta){
        carpeta.agregarMail(email);
        this.eliminarMail(email);
    }

    public Email buscar (String texto) {
        return this.emails.stream().filter(e -> e.contiene(texto)).findFirst().orElse(null);
    }

    public int tamanioCarpeta(){
        return this.emails.stream().mapToInt(e -> e.tamanioEmail()).sum();
    }
}
