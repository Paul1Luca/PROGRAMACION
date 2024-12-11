import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un cateto");
        int cateto1 = sc.nextInt();
        System.out.println("Introduce otro cateto");
        int cateto2 = sc.nextInt();

        double hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println(hipotenusa);
    }
}
