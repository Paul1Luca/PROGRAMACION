import java.io.IOException;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra");
        char letra = (char) System.in.read();

        if (letra > 90 || letra < 65) {
            System.out.println("La letra es minúscula o no es letra");
        }else {
            System.out.println("La letra es mayúscula");
        }
    }
}
