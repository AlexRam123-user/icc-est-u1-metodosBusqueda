public class MetodosBusqueda {
    // Busqueda Secuencial
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
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

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                // Valor Encontrado
                return medio;
            }

            if (arr[medio] < value) {
                // Valor Encontrado
                inicio = medio + 1; // Buscar en la mitad de la derecha
            } else {
                fin = medio - 1;// Buscar en la mitad de la izquierda
            }
        }

        return -1;
    }
}
