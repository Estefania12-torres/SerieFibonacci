package PACKAGE_NAME;public class Arbol {
  
    public Node raiz;
    public Node dato;

    public Arbol(int dato) {
        this.dato = new Node(dato);
    }

    public void agregarDato(int dato) {
    }

    public String toString() {
        return "Arbol" + this.raiz.dato;
    }
}
