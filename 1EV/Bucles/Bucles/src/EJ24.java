import java.util.Enumeration;
import java.util.Scanner;

public class EJ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        int contador = 0;
        int numero;

        System.out.println("Introduce una serie de números positivos. Finaliza con un cero");
        do {
            numero = sc.nextInt();
            if (numero > mayor){
                mayor = numero;
            }
            contador++;
        }while (numero != 0);
        System.out.println("El número mayor es " + mayor + ", y el total es " + contador);
    }
}
