import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 32 al 255");
        int n = sc.nextInt();

        System.out.printf("EL número corresponde a " + (char)n);
    }
}
