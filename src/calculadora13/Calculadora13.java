/**
 * Esta clase contiene las operaciones básicas y avanzadas de una calculadora.
 * Proyecto realizado para la práctica de Git  y GitHub.
 * 
 * @author TuNombre
 * @version 1.0
 * @since 1.0
 * @see <a href="http://www.google.com">Documentacion de Google</a>
 */
package calculadora13;

public class Calculadora13 {
	public int sumar(int a, int b) {
		 return a + b;
		 }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }
    
    public int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}


