import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        System.out.println(texto.toUpperCase());
    }
}
