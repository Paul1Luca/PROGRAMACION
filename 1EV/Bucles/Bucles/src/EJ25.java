import java.io.IOException;
import java.util.Scanner;

public class EJ25 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;

        do {
            System.out.println("Ingrese un día");
            dia = sc.nextInt();
        }while (dia < 1 || dia > 31);

        do {
            System.out.println("Ingrese un mes");
            mes = sc.nextInt();
        }while (mes < 1 || mes > 12);

        do {
            System.out.println("Ingrese un año");
            anyo = sc.nextInt();
        }while (anyo < 1900 || anyo > 2024);

        System.out.printf("%d/%d/%d", dia, mes, anyo);
    }
}
