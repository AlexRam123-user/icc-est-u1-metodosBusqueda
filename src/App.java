import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MetodosBusqueda mB = new MetodosBusqueda();

        int[] arreglo = new int[100000];

        for (int i = 0; i < 100000; i++) {
            arreglo[i] = i + 1;
        }
        int valorBuscado = 50418;

        // Busqueda Secuencial
        long startTimeS = System.nanoTime();
        int posicion = mB.busquedaSecuencial(arreglo, valorBuscado);
        if (posicion != -1) {
            System.out.println("El valor se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        long endTimeS = System.nanoTime();
        long totalTimeS = endTimeS - startTimeS;
        System.out.println("Tiempo de ejecucion metodo Secuencial "+totalTimeS+" nanosegundos");

        //Busqueda Binaria
        long startTimeB = System.nanoTime();
        int posi = mB.busquedaBinaria(arreglo, 50418);
        if (posi != -1) {
            System.out.println("El valor se encuentra en la posicion: " + posi);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        long endTimeB = System.nanoTime();
        long totalTimeB = endTimeB - startTimeB;
        System.out.println("Tiempo de ejecucion metodo Secuencial "+totalTimeB+" nanosegundos");
    }
}