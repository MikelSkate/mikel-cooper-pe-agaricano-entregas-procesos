/*
 * PSP · Tema 2 · LetrasRunnable.java
 * Forma: implementando Runnable
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
 *  Salen de manera desordenana, no es diferente cada vez, si ya que es el procesador quien se encarga de utilizar los hilos como vea combeniente
 * 
 *  2. Cambia los tres start() por run(). ¿Qué sale ahora? ¿Por qué?
 *  Si lo cambiamos por run salen de manera ordenada, no van de manera desordenado porque el procesador simplemente sigue las instrucciones que se le han indicado
 * 
 */

// TODO: crea aquí la clase del hilo (sin "public").
//       Dale un nombre distinto al de la otra versión de este ejercicio
//       para que no choquen en la misma carpeta.
//   - Atributos para los datos que recibe.
//   - Constructor que los recibe y los guarda.
//   - public void run() con el trabajo del hilo.

class HiloLetras implements Runnable{

    private int n;
    private char letra;

    public HiloLetras(int n, char letra) {
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


public class LetrasRunnable {
    public static void main(String[] args) {
        HiloLetras tarea1 = new HiloLetras(1000, 't');
        HiloLetras tarea2 = new HiloLetras(1000, 'x');   
        HiloLetras tarea3 = new HiloLetras(1000, 'a');   
        Thread hilo = new Thread(tarea1);            
        hilo.start();
        Thread hilo2 = new Thread(tarea2);            
        hilo2.start();       
        Thread hilo3 = new Thread(tarea3);            
        hilo3.start(); 

        hilo.run();
        hilo2.run();
        hilo3.run();
    }
}
