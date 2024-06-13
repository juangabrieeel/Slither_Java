package proyectoSlitherTest;

import java.util.Scanner;
import proyectoSlither.Slither;
import proyectoSlither.funciones;
import static proyectoSlither.funciones.pintarMenu;

public class ProyectoSlitherTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Atributos
        short opcion = -1;
        String nombre;

        //Crear Slithers
        Slither s1 = new Slither("Pepe Viyuela");
        Slither s2 = new Slither("Juan y Medio");

        //Menu
        pintarMenu();
        do {
            System.out.print("Introduce la opción: ");
            opcion = sc.nextShort();

            funciones.switchOpcion(opcion, s1, s2);
        } while (opcion != 0);
    }
}
