
public class Colas_principal {
    
    public static void main(String [] args){
        
        System.out.println("_____________________________________");
        
        //Creando una cola con elementos String
        Queue<String> cadenas = new Queue<String>();
        
        //Imprime true si la cola esta vacía o false si es que no
        System.out.println("\nCola vacía: "+cadenas.colaVacia());
        
        //Añadiendo elementos de tipo String
        cadenas.crearNodo("Uno");
        cadenas.crearNodo("Dos");
        cadenas.crearNodo("Tres");
        cadenas.crearNodo("Cuatro");
        cadenas.crearNodo("A");
        cadenas.crearNodo("B");
        cadenas.crearNodo("C");
        
        //Imprime la cola inicial
        System.out.println("\nCola inicial:\n"+cadenas);
        
        //True o false si es que esta vacía
        System.out.println("\nCola vacía: "+cadenas.colaVacia());
        
        //Imprime el último nodo
        System.out.println("\nPrimer elemento: "+cadenas.primerNodo());
        
        //Elimina el último nodo e imprime el siguiente
        System.out.println("\nEliminando primer elemento...");
        System.out.println("Elemento eliminado: "+cadenas.eliminarNodo());
        
        //Imprime toda la cola
        System.out.println("\nCola modificada:\n"+cadenas);
        
        //Crea un nuevo elemento e imprime cola total
        cadenas.crearNodo("Siete");
        System.out.println("\nCreando elemento 'Siete'...");
        
        //Imprime cola final
        System.out.println("\nCola final:\n"+cadenas);
        
        
        
        
        
        System.out.println("\n_____________________________________");
        
        //Creando nueva cola pero con números
        Queue<Double> numeros = new Queue<Double>();
        
        //Imprime true si la cola esta vacía o false si es que no
        System.out.println("\nCola vacía: "+numeros.colaVacia());
        
        //Añadiendo elementos de tipo Integer
        numeros.crearNodo(1.4);
        numeros.crearNodo(2.5);
        numeros.crearNodo(3.1);
        numeros.crearNodo(4.0);
        numeros.crearNodo(5.2);
        numeros.crearNodo(6.5);
        numeros.crearNodo(7.9);
        
        //Imprime la cola inicial
        System.out.println("\nCola inicial:\n"+numeros);
        
        //True o false si es que esta vacía
        System.out.println("\nCila vacía: "+numeros.colaVacia());
        
        //Imprime el último nodo
        System.out.println("\nÚltimo elemento: "+numeros.primerNodo());
        
        //Elimina el último nodo e imprime el siguiente
        System.out.println("\nEliminando primer elemento...");
        System.out.println("Elemento eliminado: "+numeros.eliminarNodo());
        
        //Imprime toda la cola
        System.out.println("\nCola modificada:\n"+numeros);
        
        //Crea un nuevo elemento
        numeros.crearNodo(10.3);
        System.out.println("\nCreando elemento 10.3...");
        
        //Imprime pila final
        System.out.println("\nCola final:\n"+numeros);
        
        
        
        System.out.println("\n_____________________________________");
        
    }
}
