/*
 * PSP · Tema 2 · LetrasThread.java
 * Forma: extendiendo Thread
 *
 * Ejercicio 2 · Tres hilos escribiendo letras
 * Crea un hilo con dos atributos: un número y una letra (char).
 * El hilo escribe la letra tantas veces como indique el número.
 *  - Número y letra se reciben en el constructor.
 *  - Cada letra seguida de un espacio, sin saltar de línea (System.out.print).
 *  - Desde el main, lanza 3 hilos en este orden: 1000 veces t, 1000 veces x, 1000 veces a.
 *
 * Para pensar:
 *  1. ¿En qué orden salen las letras? ¿Es siempre el mismo? ¿Coincide con tu apuesta?
 *  2. Cambia los tres start() por run(). ¿Qué sale ahora? ¿Por qué?
 */

/*
 * MI APUESTA (escríbela ANTES de ejecutar): ¿qué crees que va a salir?
 *
 *
 * RESULTADO tras ejecutarlo 3 veces:
 *
 */

// TODO: crea aquí la clase del hilo (sin "public").
//       Dale un nombre distinto al de la otra versión de este ejercicio
//       para que no choquen en la misma carpeta.
//   - Atributos para los datos que recibe.
//   - Constructor que los recibe y los guarda.
//   - public void run() con el trabajo del hilo.

class HiloLetrasThread extends Thread{

    private int n;
    private char letra;

    public HiloLetrasThread(int n, char letra) {
        this.n = n;
        this.letra = letra;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < n; i++) {
            System.out.print(letra + " ");
        }
    }
}

public class LetrasThread {
    public static void main(String[] args) {
        HiloLetrasThread hilo1 = new HiloLetrasThread(1000, 't');
        HiloLetrasThread hilo2 = new HiloLetrasThread(1000, 'x');
        HiloLetrasThread hilo3 = new HiloLetrasThread(1000, 'a');
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
