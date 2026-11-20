/*
 * PSP · Tema 2 · SumasRunnable.java
 * Forma: implementando Runnable
 *
 * Ejercicio 3 · Sumatorias con nombre
 * Crea un hilo que calcule la sumatoria (1 + 2 + ... + n) de un número.
 *  - El hilo recibe en el constructor el número y su nombre.
 *  - Al terminar escribe:  Suma calculada por el hilo primero: ...
 *  - Desde el main, lanza 3 hilos: "primero" con 24, "segundo" con 34, "tercero" con 14.
 * Pista nombre:
 *  - Thread:   super(nombre); en la 1.ª línea del constructor y getName() en run().
 *  - Runnable: new Thread(tarea, nombre) y Thread.currentThread().getName() en run().
 * Comprobación: calcula a mano la sumatoria de 14 y compárala con "tercero".
 *
 * Para pensar:
 *  1. ¿En qué orden salen los resultados? ¿Coincide con el orden de lanzamiento?
 *  2. Los tres hilos van a la vez. ¿Por qué ninguna suma sale mal?
 *  3. Quita el nombre. ¿Qué nombre escribe ahora cada hilo?
 */

// TODO: crea aquí la clase del hilo (sin "public").
//       Dale un nombre distinto al de la otra versión de este ejercicio
//       para que no choquen en la misma carpeta.
//   - Atributos para los datos que recibe.
//   - Constructor que los recibe y los guarda.
//   - public void run() con el trabajo del hilo.


public class SumasRunnable {
    public static void main(String[] args) {
        // TODO: crea el/los hilo(s) y arráncalos con start().
    }
}
