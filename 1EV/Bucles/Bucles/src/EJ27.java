import java.util.Scanner;

public class EJ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int mayor = 0;
        System.out.println("Cuantos números quieres introducir?");
        int cantidad = sc.nextInt();

        do {
            System.out.println("Introduce un número");
            int numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            contador++;
        }while(contador < cantidad);

        System.out.println("El mayor es el número " + mayor);
    }
}
