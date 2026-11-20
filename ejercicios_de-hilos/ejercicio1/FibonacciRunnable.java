/*
 * PSP · Tema 2 · FibonacciRunnable.java
 * Forma: implementando Runnable
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

class HiloFibonacci implements Runnable{

    @Override
    public void run() {

        int n = 10;

        int primerNumero = 1;
        int segundoNumero = 1;
        
        for (int i = 0; i < n; i++) {

            System.out.println(primerNumero);
            System.out.println(segundoNumero);

            primerNumero = primerNumero + segundoNumero;
            segundoNumero = segundoNumero + primerNumero;
        }
    }
}


public class FibonacciRunnable {
    public static void main(String[] args) {
        HiloFibonacci tarea = new HiloFibonacci();   
        Thread hilo = new Thread(tarea);            
        hilo.start();                                
    }
}
