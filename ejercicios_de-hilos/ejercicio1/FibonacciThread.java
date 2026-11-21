/*
 * PSP · Tema 2 · FibonacciThread.java
 * Forma: extendiendo Thread
 *
 * Ejercicio 1 · La serie de Fibonacci
 * Crea un hilo que calcule y escriba los N primeros números de Fibonacci.
 *  - El hilo recibe N en su constructor.
 *  - Todos los números en una sola línea, separados por un espacio.
 *  - Desde el main, lanza un hilo con N = 10.
 * Comprobación: deben salir 10 números, empezando por 1 1 2 3 5 8 13 ...
 *
 * Para pensar: compara tus dos versiones. ¿Qué parte es idéntica? ¿Qué cambia?
 */

// TODO: crea aquí la clase del hilo (sin "public").
//       Dale un nombre distinto al de la otra versión de este ejercicio
//       para que no choquen en la misma carpeta.
//   - Atributos para los datos que recibe.
//   - Constructor que los recibe y los guarda.
//   - public void run() con el trabajo del hilo.

class HiloFibonacciThread extends Thread {

    private int n;

    public HiloFibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        int primerNumero = 1;
        int segundoNumero = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(primerNumero + " ");

            int suma = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = suma;
        }
        System.out.println();
    }
}

public class FibonacciThread {
    public static void main(String[] args) {
        HiloFibonacciThread hilo = new HiloFibonacciThread(10);
        hilo.start();
    }
}
