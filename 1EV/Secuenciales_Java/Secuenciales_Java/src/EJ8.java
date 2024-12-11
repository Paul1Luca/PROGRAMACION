import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un lado del rectángulo");
        double lado1 = sc.nextDouble();
        System.out.println("Introduce el otro lado");
        double lado2 = sc.nextDouble();

        double perimetro = lado1 + lado2;
        double area = lado1 * lado2;
        double diagonal = Math.sqrt(Math.pow(area, 2) + Math.pow(perimetro, 2));
        double areatri = lado1 * lado2 / 2;

        System.out.printf("Perimetro: " + perimetro + "\nArea: " + area + "\nDiagonal: " + diagonal + "\nÁrea Triángulo: " + areatri);
    }
}
