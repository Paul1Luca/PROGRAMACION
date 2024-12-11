import java.util.Random;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int [] vector = new int [15];
        for (int i = 0 ; i < vector.length ; i++) {
            vector[i] = r.nextInt(20);
        }

        System.out.println("Cuántos números quieres sumar?");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 0 ; i <= num ; i++) {
            suma = suma + vector[i];
        }

        for (int i = 0 ; i < vector.length ; i++) {
            System.out.printf("%d,", vector[i]);
        }
        System.out.printf("%nLa suma da como resultado " + suma);
    }
}
