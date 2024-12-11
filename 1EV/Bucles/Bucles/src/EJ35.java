import java.io.IOException;
import java.util.Scanner;

public class EJ35 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        char caracter;
        int minusculas = 0;

        do {
            System.out.println("Introduce caracteres (minimo 10)");
            do {
                caracter = (char) System.in.read();
                contador++;
                if (caracter >= 97 && caracter <= 122) {
                    minusculas++;
                }
                if (caracter =='\n')
                    System.out.println("Introduce caracteres (minimo 10)");
            }while (caracter != '.');

        }while (contador < 10);
        System.out.println("El número de minúsculas introducidas es " + minusculas);
    }
}
