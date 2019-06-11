package Memento;

import java.util.ArrayList;

public class GestorMarcadores {
    private ArrayList<Memento> marcadores = new ArrayList<Memento>();

    public void addPosicionMarcador(Memento memento){
        marcadores.add(memento);
    }

    public Memento getPosicionMarcador(int indice){
        return marcadores.get(indice);
    }
}
