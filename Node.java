
public class Node <T> {
    private T dato;
    private Node<T> next;

    public Node(T dato, Node<T> next) {
        this.dato = dato;
        this.next = next;
    }

    public Node(T dato) {
        this.dato = dato;
    }
    
    public Node() {
        
    }

    public T getDato() {
        return dato;
    }

    public Node getNext() {
        return next;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
