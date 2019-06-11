import Memento.GestorMarcadores;
import Memento.RevistaOriginator;

import java.awt.geom.RectangularShape;

public class Main {
    public static void main(String[] args) {

        GestorMarcadores obGestorMarcadores = new GestorMarcadores();

        //abrimos la revista y vamos a la pagina 10
        RevistaOriginator Revista = new RevistaOriginator();
        Revista.irPagina(10);

        //Guardaos la pagina en marcadores
        obGestorMarcadores.addPosicionMarcador(Revista.guardarMarcador());

        //saltamos a la pagina 50
        Revista.irPagina(50);

        //guardamos la pagina en marcadores
        obGestorMarcadores.addPosicionMarcador(Revista.guardarMarcador());

        //volvemos a la primera pagina guardada en marcadores
        Revista.recuperarPagina(obGestorMarcadores.getPosicionMarcador(0));

        //saltamos a la segunda pagina guardadaa en marcadores
        Revista.recuperarPagina(obGestorMarcadores.getPosicionMarcador(1));



    }
}
