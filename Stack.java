
public class Stack <T> {
    private Node<T> tope;

    public Stack () {
        this.tope = null;
    }
    
    public boolean pilaVacia() {
        return tope == null;
    }
    
    public T ultimoNodo() {
        return (T)(tope.getDato());
    }
    
    public T eliminarNodo() {
        T dato = tope.getDato();
        tope = tope.getNext();
        
        return dato;
    }
    
    public void crearNodo(T dato) {
        Node<T> n = new Node<T>(dato, tope);
        tope = n;
    }
    
    public int buscarNodo(T dato) {
        int cont = 1;
        Node<T> aux = tope;
        
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return cont;
            }
            
            aux = aux.getNext();
            cont++;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        
        if (tope != null) {
            Node<T> aux = tope;
            String text = "["+aux.getDato();

            do {
                aux = aux.getNext();
                text += ", "+aux.getDato().toString();
            } while (aux.getNext() != null);
            
            return text+"]";
        } else {
            return null;
        }
    }
}
