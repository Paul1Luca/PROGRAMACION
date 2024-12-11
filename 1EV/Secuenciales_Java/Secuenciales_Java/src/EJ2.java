import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce el precio");
        int precio = scaner.nextInt();

        System.out.println("Introduce la cantidad");
        int cantidad = scaner.nextInt();

        int total = precio*cantidad;
        System.out.println("La cantidad es: " + total);
    }

}
