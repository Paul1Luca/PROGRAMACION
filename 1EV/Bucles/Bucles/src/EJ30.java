import java.util.Scanner;

public class EJ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        for (int total = 0;total <= 50; total = total + n) {
            System.out.println("Introduce número");
            n = sc.nextInt();
        }

        System.out.println("Superaste ya el número 50");
    }
}
