package Memento;

public class RevistaOriginator {

    private int pagina_actual;

    public void irPagina(int pagina){
        this.pagina_actual = pagina;
        System.out.println("Agregado marcador pagina : " + this.pagina_actual);
    }

    public Memento guardarMarcador(){
        System.out.println("===== MARCADOR GUARDADO");
        return new Memento(this.pagina_actual);
    }

    public void recuperarPagina(Memento memento){
        this.pagina_actual = memento.getEstado();
        System.out.println("pagina " + pagina_actual);
    }
}
