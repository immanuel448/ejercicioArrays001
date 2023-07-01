
public class metodos {
    // MÉTODOS       MÉTODOS         MÉTODOS         MÉTODOS         MÉTODOS         MÉTODOS

    public static int definirArray() {
        int dimension = 0;
        do {
            dimension = obtenerDatos.obtenerInt("\nIndique la dimención del Array: ");
            if (dimension <= 0) {
                System.out.println("ERROR, el dato no puede ser cero ni negativo.");
            }
        } while (dimension <= 0);// entra al bucle cuando hay errores
        return dimension;
    }// definir

    public static int[] llenarArray(int dimension, int arrayParaLlenar[]) {
        System.out.println("\nPor favor ingrese los " + dimension + " datos: ");
        for (int e = 0; e < dimension; e++) {
            // pedir y guardar
            arrayParaLlenar[e] = obtenerDatos.obtenerInt("Ingrese el dato " + (e + 1) + ": ");
        } // for llena el array
        return arrayParaLlenar;
    }// llenar

    //número más pequeño a la izquierda
    public static int[] ordenarAscendente(int arrayPasado[]) {
        int apoyo;
        //la dimensión es -1 para no afectar al siguiente for
        for (int uno = 0; uno < arrayPasado.length - 1; uno++) {
            //el segundo for ya no revisará las posiciones pasadas del primer for
            for (int dos = uno + 1; dos < arrayPasado.length; dos++) {
                //siempre se evalúa el dato en curso del primer for
                if (arrayPasado[uno] > arrayPasado[dos]) {// se debe intercambiar el número
                    apoyo = arrayPasado[dos];
                    arrayPasado[dos] = arrayPasado[uno];
                    arrayPasado[uno] = apoyo;
                }
            }
        }
        return arrayPasado;
    }// ascendente

    //número más grande a la izquierda
    public static int[] ordenarDescendente(int arrayPasado[]) {
        int apoyo;
        //la dimensión es -1 para no afectar al siguiente for
        for (int uno = 0; uno < arrayPasado.length - 1; uno++) {
            //el segundo for ya no revisará las posiciones pasadas del primer for
            for (int dos = uno + 1; dos < arrayPasado.length; dos++) {
                //siempre se evalúa el dato en curso del primer for
                if (arrayPasado[uno] < arrayPasado[dos]) {// se debe intercambiar el número
                    apoyo = arrayPasado[dos];
                    arrayPasado[dos] = arrayPasado[uno];
                    arrayPasado[uno] = apoyo;
                }
            }
        }
        return arrayPasado;
    }// descendente

    public static int[] obtenerPares(int arrayPasado[]) {
        int soloPares[];
        int saberCantidad = 0;

        for (int numero : arrayPasado) {
            if (numero % 2 == 0) {// es par
                saberCantidad++;
            }
        } // saber la cantidad de pares que hay
        soloPares = new int[saberCantidad];
        saberCantidad = 0;
        for (int e = 0; e < arrayPasado.length; e++) {
            if (arrayPasado[e] % 2 == 0) {// es par
                soloPares[saberCantidad++] = arrayPasado[e];
            }
        }
        return soloPares;
    }// pares

    public static int[] obtenerImpares(int arrayPasado[]) {
        int soloImpares[];
        int saberCantidad = 0;

        for (int numero : arrayPasado) {
            if (numero % 2 != 0) {// es impar
                saberCantidad++;
            }
        } // saber la cantidad de pares que hay
        soloImpares = new int[saberCantidad];
        saberCantidad = 0;
        for (int e = 0; e < arrayPasado.length; e++) {
            if (arrayPasado[e] % 2 != 0) {// es impar
                soloImpares[saberCantidad++] = arrayPasado[e];
            }
        }
        return soloImpares;
    }// impares

    // mostrar datos
    public static void mostrarDatos(int arrayRecibido[], String mensaje) {
        System.out.println("\n+  +  +  +  +  +  +  +  +  +  +  +  +  +  +  +");
        System.out.println(mensaje);
        for (int i = 0; i < arrayRecibido.length; i++) {
            System.out.print(arrayRecibido[i]);
            if (i < arrayRecibido.length - 1) {
                System.out.print(", ");
            } else {// antes de salir
                System.out.print("\n");
            }
        } // for
        System.out.println("+  +  +  +  +  +  +  +  +  +  +  +  +  +  +  +");
    }// método mostrar datos
}// clase principal
