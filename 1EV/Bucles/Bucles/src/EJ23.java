import java.io.IOException;
import java.util.Scanner;

public class EJ23 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        char letra;

        System.out.println("Introduce una frase. Cuando quieras terminar introduce un .");

        do {
            letra = (char) System.in.read();
            contador++;
            if (letra == ' ' || letra == '\n') {
                contador--;
            }
        } while (letra != '.');
        System.out.println("El numero de caracteres totales es " + contador);
    }
}
