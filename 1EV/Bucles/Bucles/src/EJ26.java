import java.util.Scanner;

public class EJ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int menor = 0;
        System.out.println("Cuantos números quieres introducir?");
        int cantidad = sc.nextInt();

        do {
            System.out.println("Introduce un número");
            int numero = sc.nextInt();
            if (contador == 0){
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            contador++;
        }while(contador < cantidad);

        System.out.println("El menor es el número " + menor);
    }
}
