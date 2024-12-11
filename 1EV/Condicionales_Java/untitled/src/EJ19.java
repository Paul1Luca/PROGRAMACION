import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de segundos");
        int seg = sc.nextInt();


            int semanas = seg%604800;
        System.out.println(semanas);
    }
}
