import java.util.Scanner;

public class EJ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        do {
            System.out.println("Introduzca un número");
            int num = sc.nextInt();

            if (num % 6 == 0 && num % 3 == 0) {
                total = total + num;
            }

        }while (total <= 30);

        System.out.println("Superaste el valor de 30");
    }
}
