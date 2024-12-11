import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el año");
        int a = sc.nextInt();

        if (a%4 == 0) {
            if (a%100 == 0) {
                if (a%400 == 0) {
                    System.out.println("Es bisiesto");
                }else {
                    System.out.println("No es bisiesto");
                }
            }else {
                System.out.println("Es bisiesto");
            }
        }else {
            System.out.println("No es bisiesto");
        }
    }
}
