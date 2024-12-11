import java.io.IOException;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un carácter");
        char caracter = (char) System.in.read();

        System.out.printf("Su codigo ASCII es " + (int)caracter);
    }
}