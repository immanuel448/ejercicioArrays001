import java.util.Scanner;

/*
Se piden datos desde la consola (como String), SE REGRESA UN string O UN integer
aquí se atrapan los errores
y se asegura de obtener el dato mediante bucles
*/

public class obtenerDatos {

    private static Scanner scan = new Scanner(System.in);
    private static int obtenerInt = 0;

    // MÉTODOS      MÉTODOS      MÉTODOS         MÉTODOS         MÉTODOS
    // requiere de un mensaje que pida lo deseado, devuelve un string, sólo se usa aquí
    public static String obtenerDatoString(String mensaje) {
        String obtenerString = "";
        do {
            System.out.print(mensaje);
            obtenerString = scan.nextLine();
        } while (obtenerString.equals(null) || obtenerString.equals("") || obtenerString.isEmpty());

        return obtenerString;
    }

    public static int obtenerInt(String mensaje) {// requiere de un mensaje, devuelve un Integer
        boolean bucle = false;
        do {
            try {
                obtenerInt = Integer.parseInt(obtenerDatoString(mensaje));
                bucle = false;
            } catch (Exception e) {
                System.out.print("ERROR, dato inválido, reingrese. ");// no es un número entero
                bucle = true;
            }
        } while (bucle);
        return obtenerInt;
    }

    public static String obtenerString(String mensaje) {// requiere de un mensaje, devuelve un String
        try {
            return obtenerDatoString(mensaje);
        } catch (Exception e) {
            return "-0";
        }
    }

}// clase principal
