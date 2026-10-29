package co.umariana;

public class Calculadora {

    // Sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Dividir dos números
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

    // Verificar si un número es par
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

