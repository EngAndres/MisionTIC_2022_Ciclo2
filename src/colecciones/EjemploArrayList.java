package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casierrav
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        List ejemplo = new ArrayList();
        
        ejemplo.add(5);
        ejemplo.add(7);
        ejemplo.add(9);
        ejemplo.add(0,2);
        ejemplo.add(1,15);
        
        System.out.println("Lista: " + ejemplo);
        System.out.println("Lista Tamaño: " + ejemplo);
        
        ejemplo.remove(3);
        
        System.out.println("Lista por elemento: ");
        for(Object dato: ejemplo){
            System.out.println( dato );
        }
        
        System.out.println("Primer elemento: " + ejemplo.get(0));
    }
   
}