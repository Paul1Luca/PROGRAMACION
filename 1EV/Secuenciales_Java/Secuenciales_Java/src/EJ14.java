import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el total de las calificaciones");
        double calificaciones = sc.nextDouble();
        System.out.println("Nota del examen final");
        double nota = sc.nextDouble();
        System.out.println("Nota trabajo final");
        double nota2 = sc.nextDouble();

        double promedio = (calificaciones / 3) * 0.55;
        double examen = nota * 0.30;
        double trabajo = nota2 * 0.15;
        double califinal = promedio + examen + trabajo;

        System.out.printf("Tienes como nota final un %.2f", califinal);
    }
}
