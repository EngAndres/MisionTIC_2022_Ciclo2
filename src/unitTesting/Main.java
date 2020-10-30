package unitTesting;

/**
 *
 * @author casierrav
 */
public class Main {
    public static void main(String[] args){
        CalculadoraSimple calculadora = new CalculadoraSimple();
        System.out.println(calculadora.sumar(5, 8));
        System.out.println(calculadora.restar(5, 8));
        System.out.println(calculadora.multiplicar(5, 8));
    }
}
