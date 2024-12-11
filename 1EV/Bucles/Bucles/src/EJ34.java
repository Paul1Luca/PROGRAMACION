import java.io.IOException;
import java.util.Scanner;

public class EJ34 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese caracteres");
        do {
            caracter = (char) System.in.read();
        }while (!(caracter >= 65 && caracter <= 90));
    }
}
