import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el total de la compra");
        double total = sc.nextDouble();

        double descuento = total * 0.15;
        double preciofinal = total - descuento;

        System.out.printf("EL descuento resta " + descuento + ", con lo que se debe pagar " + preciofinal);
    }
}
