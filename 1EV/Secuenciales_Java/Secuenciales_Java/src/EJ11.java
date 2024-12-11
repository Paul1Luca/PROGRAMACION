import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las pulgadas");
        double pulgadas = sc.nextDouble();

        double cm = pulgadas * 2.54;
        System.out.println(cm);
    }
}
