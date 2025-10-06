package ejercicio15;

import java.util.ArrayList;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private ArrayList<Carpeta> carpetas;

    public ClienteDeCorreo(String nombre){
        this.inbox = new Carpeta(nombre);
        this.carpetas = new ArrayList<Carpeta>();
        this.carpetas.add(this.inbox);
    }

    public void agregarCarpeta(Carpeta carpeta){
        this.carpetas.add(carpeta);
    }

    public void recibir (Email mail){
        this.inbox.agregarMail(mail);
    }

    public void mover (Email mail, Carpeta carpeta){
        carpeta.mover(mail,carpeta);
    }

    public Email buscar(String texto){
        return this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e.contiene(texto)).findFirst().orElse(null);
    }

    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(c -> c.tamanioCarpeta()).sum();
    }
}
