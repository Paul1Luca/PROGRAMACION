import java.io.IOException;
import java.util.Scanner;

public class EJ33 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char caracter;
        int contador = 0;
        System.out.println("Ingrese caracteres. Termina con un punto");
        do {
            caracter = (char) System.in.read();
            if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' || caracter == 'i' ||
                    caracter == 'I' || caracter == 'o' || caracter == 'O' || caracter == 'u' || caracter == 'U'){
                contador++;
            }

        }while (caracter != '.' && contador < 5 );
    }
}
