package proyectoSlither;

public class Slither {

    //Atributos
    private int tamano;
    private String nombre;

    //Constructores
    public Slither(String nombre) {
        this.tamano = 5;
        this.nombre = nombre;
    }

    //Getters y Setters
    //Metodo
    public void comer(ColorComida colorComida) {
        switch (colorComida) {
            case Rojo:
                this.tamano += 1;
                break;
            case Naranja:
                this.tamano += 4;
                break;
            case Verde:
                this.tamano += 9;
                break;
            default:
                break;
        }
    }

    public void cruzar(Slither s1, Slither s2) {
        if (s1.tamano == s2.tamano || s1.tamano > s2.tamano) {
            s1.tamano += s2.tamano;
            s2.tamano = 1;
            System.out.println("El Slither " + s1.nombre + " se ha comido a " + s2.nombre + ".");
        } else {
            s2.tamano += s1.tamano;
            s1.tamano = 1;
            System.out.println("El Slither " + s2.nombre + " se ha comido a " + s1.nombre + ".");
        }
    }

    public void mostrarTamano(Slither s1) {
        System.out.printf("El tamaño del Slither " + s1.nombre + " es: %d \n", s1.tamano);
    }

    public void mostrarSlither() {
        char[][] matriz = new char[this.tamano][20];
        System.out.println("Jugador: " + this.nombre);
        // Pintar la cabeza en la posición (0, 10)
        matriz[0][10] = 'O';

        // Pintar el cuerpo de la serpiente
        int x = 10;
        for (int i = 1; i < this.tamano; i++) {
            x += (int) (Math.random() * 3) - 1;
            matriz[i][x] = 'X';
        }

        // Imprimir la matriz
        for (int i = 0; i < this.tamano; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
