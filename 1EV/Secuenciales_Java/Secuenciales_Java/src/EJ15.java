import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce su salario");
        double sal = sc.nextDouble();

        double suma = sal * 0.25;
        double total = suma + sal;
        System.out.printf("Su salario aumenta en %.2f", suma, "€, por lo que se quedará en %.2f", total , "€.");
    }
}
