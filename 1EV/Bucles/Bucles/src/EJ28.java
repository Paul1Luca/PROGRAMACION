import java.util.Scanner;

public class EJ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        int contador;

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        for (contador = 1, total = 0 ; contador <= (num/2) ; contador++) {
            if (num%contador == 0){
                total = total + contador;
            }
        }

        if (total == num){
            System.out.println("EL numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }
}
