import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] palabras = new String[10];
        int i = 0;
        boolean salir = false;
        do {
            System.out.println("Escribe una palabra. Cuando termines escribe 'STOP'");
            String cadena = br.readLine();
            if (!cadena.equals("STOP")) {
                palabras[i] = cadena;
            } else
                salir = true;
        } while (!salir);
    }
}
