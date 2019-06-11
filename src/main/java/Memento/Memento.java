package Memento;

public class Memento {

    private int estado;

    public Memento(int estado){
        this.estado = estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
    }

    public int getEstado(){
        return this.estado;
    }
}
