package ejercicio15;

import java.util.ArrayList;

public class Email {
    private String titulo;
    private String cuerpo;
    private ArrayList<Archivo> adjuntos;

    public Email (String titulo , String cuerpo){
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList<Archivo>();
    }

    public void agregarAdjunto(Archivo a){
        this.adjuntos.add(a);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getCuerpo(){
        return this.cuerpo;
    }

    public ArrayList<Archivo> adjuntos(){
        return new ArrayList<Archivo>(this.adjuntos);
    }

    public int tamanioEmail(){
        return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToInt(adj -> adj.tamanio()).sum();
    }

    public boolean contiene (String texto){
        return this.titulo.equals(texto) || this.cuerpo.equals(texto);
    }
}
