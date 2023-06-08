package PACKAGE_NAME;public class Node {
  public int dato;
    public Node izquierdo;
    public Node derecho;

    public Node() {
    }

    public Node(int dato) {
        this.dato = dato;
    }

    public String toString() {
        String s = "nodo" + this.dato;
        if (this.izquierdo != null) {
            s = s + " izquierdo" + String.valueOf(this.izquierdo);
        }

        if (this.derecho != null) {
            s = s + " derecho" + String.valueOf(this.derecho);
        }

        return s;
    }
}
