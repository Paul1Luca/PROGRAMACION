import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double potencia;
        int contador = 1;

        System.out.println("Introduce la base");
        double base = sc.nextDouble();
        System.out.println("Introduce el exponente");
        double exponente = sc.nextDouble();
        double total = base;

        if (exponente == 0) {
            total = 1;
        } else if (exponente == 1) {
            total = base;
        }else {
            do {
                total = total * base;
                contador++;
            }while(contador <= exponente);
        }
        System.out.printf("%.2f", total);
    }
}
