
public class Queue <T> {
    private Node<T> root;
    private Node<T> tope;

    public Queue () {
        this.root = null;
        this.tope = null;
    }
    
    public boolean pilaVacia() {
        return tope == null;
    }
    
    public T primerNodo() {
        return (T)(root.getNext().getDato());
    }
    
    public T eliminarNodo() {
        T dato = (T) root.getNext().getDato();
        root.setNext(root.getNext().getNext());
        
        return dato;
    }
    
    public void crearNodo(T dato) {
        Node<T> n = new Node<T>(dato);
        
        if (root == null) {
            root = new Node(null, n);
            tope = new Node(null, n);
        }
        tope.getNext().setNext(n);
        tope.setNext(n);
    }
    
       
    @Override
    public String toString() {
        
        Node<T> aux = root.getNext();
        String text = "["+aux.getDato();
        aux = aux.getNext();
        
        while (aux != null) {
            text += ", "+aux.getDato().toString();
            aux = aux.getNext();
        }
        
        return text+"]";
    }
}
