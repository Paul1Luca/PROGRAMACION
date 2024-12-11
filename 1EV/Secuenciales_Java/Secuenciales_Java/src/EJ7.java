import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio");
        double radio = sc.nextInt();

        double area = Math.PI * Math.pow(radio,2);
        double longitud = 2 * Math.PI * radio;

        System.out.printf("Área: " + area + "\nLongitud: " + longitud);
    }
}
