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
        int posicionS = mB.busquedaSecuencial(arreglo, valorBuscado);
        if (posicionS != -1) {
            System.out.println("El valor "+valorBuscado+" se encuentra en la posicion: "+ posicionS);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        long endTimeS = System.nanoTime();
        long totalTimeS = endTimeS - startTimeS;
        System.out.println("Tiempo de ejecucion metodo Secuencial "+totalTimeS+" nanosegundos");

        //Busqueda Binaria
        long startTimeB = System.nanoTime();
        int posicionB = mB.busquedaBinaria(arreglo, valorBuscado);
        if (posicionB != -1) {
            System.out.println("El valor "+valorBuscado+" se encuentra en la posicion: " + posicionB);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        long endTimeB = System.nanoTime();
        long totalTimeB = endTimeB - startTimeB;
        System.out.println("Tiempo de ejecucion metodo Binario "+totalTimeB+" nanosegundos");
    }
}