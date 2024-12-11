import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Introduce el descuento del producto");
        double desc = sc.nextDouble();

        double total = precio - (precio * desc/100);
        if (total > 100){
            double extra = total - 15;
            System.out.printf("Se le aplicará un descuento extra de 15€. Pagará %.2f", extra);
        }else {
            System.out.printf("Pagrá %.2f", total);
        }
    }
}
