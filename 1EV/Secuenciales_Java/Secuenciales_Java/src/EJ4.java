import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = sc.nextInt();

        double cuadrado = Math.pow(n,2);
        System.out.println(cuadrado);
    }
}
