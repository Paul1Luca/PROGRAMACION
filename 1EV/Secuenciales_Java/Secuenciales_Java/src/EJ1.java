import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = scanner.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);

    }


}
