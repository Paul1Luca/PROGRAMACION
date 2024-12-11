import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int A = sc.nextInt();
        System.out.println("Introduce un número");
        int B = sc.nextInt();
        System.out.println("Introduce un número");
        int C = sc.nextInt();

        int D = ((A+B)/C);
        System.out.println(D);
    }
}
