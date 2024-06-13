package proyectoSlither;

public class funciones {

    public static void pintarMenu() {
        System.out.println("Pepe Viyuela----------------------------------------------");
        System.out.println("-Introduce 1 para comer una bolita roja.                  -");
        System.out.println("-Introduce 2 para comer una bolita naranja.               -");
        System.out.println("-Introduce 3 para comer una bolita verde.                 -");
        System.out.println("Juan y Medio----------------------------------------------");
        System.out.println("-Introduce 4 para comer una bolita roja.                  -");
        System.out.println("-Introduce 5 para comer una bolita naranja.               -");
        System.out.println("-Introduce 6 para comer una bolita verde.                 -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-Introduce 7 para mostrar el tamaño.                      -");
        System.out.println("-Introduce 8 para cruzar Pepe Viyuela a Juan y Medio.     -");
        System.out.println("-Introduce 9 para cruzar Juan y Medio a Pepe Viyuela.     -");
        System.out.println("-Introduce 10 para mostrar Juan y Medio.                  -");
        System.out.println("-Introduce 11 para mostrar Pepe Viyuela.                  -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-Introduce 0 para acabar el juego.                        -");
        System.out.println("-----------------------------------------------------------");
    }

    public static int switchOpcion(int opcion, Slither s1, Slither s2) {
        int resultado = 0;

        switch (opcion) {
            case 0:
                break;
            case 1:
                s1.comer(ColorComida.Rojo);
                break;
            case 2:
                s1.comer(ColorComida.Naranja);
                break;
            case 3:
                s1.comer(ColorComida.Verde);
                break;
            case 4:
                s2.comer(ColorComida.Rojo);
                break;
            case 5:
                s2.comer(ColorComida.Naranja);
                break;
            case 6:
                s2.comer(ColorComida.Verde);
                break;
            case 7:
                System.out.println("-----------------------------------------------------------");
                s1.mostrarTamano(s1);
                s2.mostrarTamano(s2);
                System.out.println("-----------------------------------------------------------");
                break;
            case 8:
                System.out.println("-----------------------------------------------------------");
                s1.cruzar(s1, s2);
                s1.mostrarTamano(s1);
                s2.mostrarTamano(s2);
                System.out.println("-----------------------------------------------------------");
                break;
            case 9:
                System.out.println("-----------------------------------------------------------");
                s2.cruzar(s2, s1);
                s1.mostrarTamano(s1);
                s2.mostrarTamano(s2);
                System.out.println("-----------------------------------------------------------");
                break;
            case 10:
                System.out.println("-----------------------------------------------------------");
                s1.mostrarSlither();
                System.out.println("-----------------------------------------------------------");
                break;
            case 11:
                System.out.println("-----------------------------------------------------------");
                s2.mostrarSlither();
                System.out.println("-----------------------------------------------------------");
                break;
            default:
                System.out.println("Introduce un número válido.");
        }

        return resultado;
    }
}
