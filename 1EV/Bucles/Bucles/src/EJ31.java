import java.io.IOException;
import java.util.Scanner;

public class EJ31 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Introduce un caracter");
            char caracter = (char) System.in.read();
        }

        System.out.println("Introduciste más de 5 caracteres");
    }
}
