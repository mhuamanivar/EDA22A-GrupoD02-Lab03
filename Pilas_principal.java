//import java.util.Scanner;

public class Pilas_principal {
    
    public static void main(String [] args){
        
        System.out.println("_____________________________________");
        
        //Creando una pila con elementos String
        Stack<String> cadenas = new Stack<String>();
        
        //Imprime true si la pila esta vacía o false si es que no
        System.out.println("\nPila vacía: "+cadenas.pilaVacia());
        
        //Añadiendo elementos de tipo String
        cadenas.crearNodo("Uno");
        cadenas.crearNodo("Dos");
        cadenas.crearNodo("Tres");
        cadenas.crearNodo("Cuatro");
        cadenas.crearNodo("A");
        cadenas.crearNodo("B");
        cadenas.crearNodo("C");
        
        //Imprime la pila inicial
        System.out.println("\nPila inicial:\n"+cadenas);
        
        //True o false si es que esta vacía
        System.out.println("\nPila vacía: "+cadenas.pilaVacia());
        
        //Imprime el último nodo
        System.out.println("\nÚltimo elemento: "+cadenas.ultimoNodo());
        
        //Elimina el último nodo e imprime el siguiente
        System.out.println("\nEliminando último elemento...");
        System.out.println("Elemento eliminado: "+cadenas.eliminarNodo());
        
        //Imprime toda la pila
        System.out.println("\nPila modificada:\n"+cadenas);
        
        //Crea un nuevo elemento e imprime pila total
        cadenas.crearNodo("Cinco");
        System.out.println("\nCreando elemento 'Cinco'...");
        
        //Imprime pila final
        System.out.println("\nPila final:\n"+cadenas);
        
        //Imprime posición del dato buscado
        System.out.println("\nPosición del elemento 'Dos': "+cadenas.buscarNodo("Dos"));
        
        
        
        
        System.out.println("\n_____________________________________");
        
        //Creando nueva pila pero con números
        Stack<Integer> numeros = new Stack<Integer>();
        
        //Imprime true si la pila esta vacía o false si es que no
        System.out.println("\nPila vacía: "+numeros.pilaVacia());
        
        //Añadiendo elementos de tipo Integer
        numeros.crearNodo(1);
        numeros.crearNodo(2);
        numeros.crearNodo(3);
        numeros.crearNodo(4);
        numeros.crearNodo(5);
        numeros.crearNodo(6);
        numeros.crearNodo(7);
        
        //Imprime la pila inicial
        System.out.println("\nPila inicial:\n"+numeros);
        
        //True o false si es que esta vacía
        System.out.println("\nPila vacía: "+numeros.pilaVacia());
        
        //Imprime el último nodo
        System.out.println("\nÚltimo elemento: "+numeros.ultimoNodo());
        
        //Elimina el último nodo e imprime el siguiente
        System.out.println("\nEliminando último elemento...");
        System.out.println("Elemento eliminado: "+numeros.eliminarNodo());
        
        //Imprime pila final
        System.out.println("\nPila final:\n"+numeros);
        
        //Imprime posición del dato buscado
        System.out.println("\nPosición del elemento 3: "+numeros.buscarNodo(3));
        
        
        System.out.println("\n_____________________________________");
        
    }
       
}