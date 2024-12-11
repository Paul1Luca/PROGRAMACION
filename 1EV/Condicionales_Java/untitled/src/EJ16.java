import java.io.IOException;
import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de zanahoria");
        char tipo = (char) System.in.read();
        System.out.println("Introduce la cantidad");
        int cantidad = sc.nextInt();

        switch (tipo){
            case 'A':
                case 'a':
                    double total = cantidad * 1.5;
                    System.out.printf("€ %.2f", total);
                    break;
            case 'B':
                case 'b':
                    total = cantidad * 1.8;
                    System.out.printf("€ %.2f", total);
                    break;
            case 'C':
                case 'c':
                    total = cantidad * 2.1;
                    System.out.printf("€ %.2f", total);
                    break;
            case 'D':
                case 'd':
                    total = cantidad * 2.5;
                    System.out.printf("€ %.2f", total);
                    break;
            case 'E':
                case 'e':
                    total = cantidad * 3.2;
                    System.out.printf("%.2f", total);
                    break;
        }
    }
}
