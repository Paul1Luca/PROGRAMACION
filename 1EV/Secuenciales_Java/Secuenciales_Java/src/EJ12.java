import java.io.IOException;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra de 5 letras");
        char letra1 = (char) System.in.read();
        char letra2 = (char) System.in.read();
        char letra3 = (char) System.in.read();
        char letra4 = (char) System.in.read();
        char letra5 = (char) System.in.read();

        int letraA = letra1 - 30;
        int letraB = letra2 - 30;


        System.out.printf("%c",letraA, "%c",letraB,"%c");


    }
}
