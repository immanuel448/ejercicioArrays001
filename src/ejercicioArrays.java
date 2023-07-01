

public class ejercicioArrays {
    // private static metodos objMetodos = new metodos();
    private static int cantidadMaxima = 0;
    private static int arrayNumeros[];
    // puden contener de 0 a la cantidad máxima de caracteres
    private static int arrayApoyo[];

    public static void main(String[] args) throws Exception {
        menu();
    }// método main

    public static void menu() {
        boolean loop = true;
        do {
            System.out.println("\n=================================================");
            System.out.println("======================MENU=======================");
            System.out.println("=================================================");
            System.out.println("(1)......Crear/indicar la dimensión del Array");
            System.out.println("(2)......Ingrese datos al Array");
            System.out.println("(3)......Ordenar y mostrar Array ascendentemente");
            System.out.println("(4)......Ordenar y mostrar Array descendentemente");
            System.out.println("(5)......Mostrar Pares");
            System.out.println("(6)......Mostrar Impares");
            System.out.println("(7)......Mostrar Array");
            System.out.println("(8)......Salir");
            int eleccion = obtenerDatos.obtenerInt("Su selección: ");

            //filtro 001
            if (eleccion < 1 || eleccion > 8) {// fuera del rango del menú
                System.out.println("\nError!, debe seleccionar un número de entre el 1 al 8");
                continue;
            } // fuera del rango del menú

            //filtro 002
            if (cantidadMaxima <= 0 && eleccion != 1 && eleccion != 8) {// no hay array definido---------------------------------
                System.out.println("\nError!, primero debe de Crear/indicar la dimensión del array");
                continue;
            }
                        
            // se abre el menú
            switch (eleccion) {
                case 1:// reiniciar, indicar la dimensión del array
                    cantidadMaxima = metodos.definirArray();//se obtiene la dimensión del array
                    arrayNumeros = new int[cantidadMaxima];// se declara el array con la dimensión requerida
                    break;
                case 2:// se procede al llenado del 
                    arrayNumeros = metodos.llenarArray(cantidadMaxima, arrayNumeros);
                    break;
                case 3:// ordenar ascendente
                    arrayApoyo = metodos.ordenarAscendente(arrayNumeros);
                    metodos.mostrarDatos(arrayNumeros, "El array ORDENADO ASCENDENTEMENTE es: ");
                    break;
                case 4:// ordenar descendente
                    arrayApoyo = metodos.ordenarDescendente(arrayNumeros);
                    metodos.mostrarDatos(arrayNumeros, "El array ORDENADO DESCENDENTEMENTE es: ");
                    break;
                case 5:// pares
                    arrayApoyo = metodos.obtenerPares(arrayNumeros);
                    metodos.mostrarDatos(arrayApoyo, "El array TIENE LOS SIGUENTES PARES: ");
                    break;
                case 6:// impares
                    arrayApoyo = metodos.obtenerImpares(arrayNumeros);
                    metodos.mostrarDatos(arrayApoyo, "El array TIENE LOS SIGUENTES IMPARES: ");
                    break;
                case 7:// mostrar el array
                    metodos.mostrarDatos(arrayNumeros, "El array ACTUAL es: ");
                    break;
                case 8:// para salir del bucle
                    loop = false;
                    break;
                default:
                    break;
            }// switch

        } while (loop);
        System.out.println("\nSaliendo...\n\n");

    }// método menú
}
