import java.util.Scanner;

/*
* se piden datos desde la consola (como String), de ahí se puede obtener un String o un int (aquí se atrapan los erroes))
*/

public class obtenerDatos {
    
    private static Scanner scan = new Scanner(System.in);
    private static int obtenerInt = 0;

    //MÉTODOS     MÉTODOS     MÉTODOS     MÉTODOS     MÉTODOS     
    public static String obtenerDatoString(String mensaje){//requiere de un mensaje que pida lo deseado, devuelve un string 
        String obtenerString = "";
        do {
            System.out.print(mensaje);
            obtenerString = scan.nextLine();
        } while ( obtenerString.equals(null) || obtenerString.equals("") || obtenerString.isEmpty());
        
        return obtenerString;
    }

    public static int obtenerInt(String mensaje){//requiere de un mensaje, devuelve un Integer
        try {
            obtenerInt = Integer.parseInt(obtenerDatoString(mensaje));
            return obtenerInt;
        } catch (Exception e) {
            return -0;
        }
    }

    public static String obtenerString(String mensaje){//requiere de un mensaje, devuelve un String
        try {
            return obtenerDatoString(mensaje);
        } catch (Exception e) {
            return "-0";
        }
    }


}//clase principal



