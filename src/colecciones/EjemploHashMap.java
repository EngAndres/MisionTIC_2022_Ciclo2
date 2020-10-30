package colecciones;

import java.util.HashMap;


/**
 *
 * @author casierrav
 */
public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notaFinal = new HashMap<String, Double>();
        
        notaFinal.put("Pepito", 3.3);
        notaFinal.put("Pepita", 4.5);
        notaFinal.put("Cosito", 3.9);
        System.out.println("HashMap: " + notaFinal);
        System.out.println("HashMap Tamaño: " + notaFinal.size());
        
        notaFinal.remove("Cosito");
            
        System.out.println("HashMap por elemento: ");
        for(String llave: notaFinal.keySet()){
            System.out.println( llave + ":" + notaFinal.get(llave));
        }
        
        
        System.out.println("Nota Pepita: " + notaFinal.get("Pepita"));
    }
    
}
