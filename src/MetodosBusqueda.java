public class MetodosBusqueda {
    // Busqueda Secuencial
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        int iter = 0;
        for (int i = 0; i < arreglo.length; i++) {
            iter++;
            if (arreglo[i] == valorBuscado) {
                System.out.println("Numero total de iteraciones secuenciales: " + iter);
                return i;
            }
            
        }
        System.out.println("Numero de iteraciones secuenciales: "+iter);
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print("|" + elemento + "|");
        }
    }

    // Busqueda Binaria
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        int iteraciones = 0;

        while (inicio <= fin) {
            iteraciones++;
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                // Valor Encontrado
                System.out.println("El numero de iteraciones de binario es: "+iteraciones);
                return medio;
            }

            if (arr[medio] < value) {
                // Valor Encontrado
                inicio = medio + 1; // Buscar en la mitad de la derecha
            } else {
                fin = medio - 1;// Buscar en la mitad de la izquierda
            }
        }
        System.out.println("El numero de iteraciones de binario es: "+iteraciones);
        return -1;
    }
}
