/*
 * PSP · Tema 2 · SumasThread.java
 * Forma: extendiendo Thread
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

class HiloSumasThread extends Thread{
    
    private int n;

    public HiloSumasThread(int n, String nombre) {
        super(nombre);
        this.n = n;
    }

    @Override
    public void run() {

        int numero = 0;
        
        for (int i = 1; i <= n; i++) {
            numero = numero + i;
        }

        System.out.println(numero + "Suma calculada por el hilo " + getName() + ": " + numero);
    }
}

public class SumasThread {
    public static void main(String[] args) {
        HiloSumasThread hilo1 = new HiloSumasThread(24, "primero");
        HiloSumasThread hilo2 = new HiloSumasThread(34, "segundo");
        HiloSumasThread hilo3 = new HiloSumasThread(14, "tercero");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
