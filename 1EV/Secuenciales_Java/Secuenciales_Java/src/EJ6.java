import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu dinero");
        double dinero = sc.nextDouble();

        int billete10 = (int) dinero/10;
        int billete5 = (int) ((dinero%10)/5);
        int moneda50 = (int) (((dinero%10)%5)/0.50);
        int moneda10 = (int) ((((dinero%10)%5)%0.50)/0.10);
        int moneda5 = (int) (((((dinero%10)%5)%0.50)%0.10)/0.05);
        int moneda1 = (int) ((((((dinero%10)%5)%0.50)%0.10)%0.05)/0.01);

        System.out.printf("Billetes 10: " + billete10 + "\nBilletes 5: " + billete5 + "\nMonedas 50: " + moneda50 + "\nMonedas 10: " + moneda10 + "\nMoneda 5: " + moneda5 + "\nMoneda 1: " + moneda1);
    }
}
