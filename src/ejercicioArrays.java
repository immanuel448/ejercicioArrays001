public class ejercicioArrays {

    
    public static void main(String[] args) throws Exception {
        menu();
    }//método main

    public static void menu(){
        boolean loop = true;
        do {
            
        } while (loop);

        System.out.println("=================================================");
        System.out.println("======================MENU=======================");
        System.out.println("=================================================");
        System.out.println("(1)......Reiniciar/indique la dimención del Array");
        System.out.println("(2)......Ingrese datos al Array");
        System.out.println("(3)......Ordenar Array ascendentemente");
        System.out.println("(4)......Ordenar Array descendentemente");
        System.out.println("(5)......Mostrar Pares");
        System.out.println("(6)......Mostrar Impares");
        System.out.println("(7)......Salir");
        int eleccion = obtenerDatos.obtenerInt("Su selección: ");
        

        switch (eleccion) {
            case 1:
                
                break;
                
            case 7://para salir del bucle
                loop = false;
                break;
            default:
                break;
        }//switch
    }//método menú
}

