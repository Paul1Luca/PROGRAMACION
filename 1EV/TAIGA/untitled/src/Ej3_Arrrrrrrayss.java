import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3_Arrrrrrrayss {
    public static void main(String[] args) throws IOException {
        //Entrar una serie de caracteres en una tabla, y mirar si esta es un
        // “palíndromo” o no lo es. Un palíndromo son aquellas palabras
        // que se leen igual de izquierda a derecha que de derecha a izquierda, por ejemplo ALLA.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe una palabra");

        //se lee la palabra como stringbuilder
        String palabra = br.readLine();

        //se crea otra variable igual y se revierte
        StringBuilder palabra2 = new StringBuilder(palabra);
        palabra2.reverse();

        //se comparan las palabras y si son iguales es un palindromo
        if (palabra.equals(palabra2.toString())) {
            System.out.println("La palabra es un palindromo");
        }else System.out.println("la palabra no es un palindromo");


        // forma usando String
        System.out.println("Escribe otra palabra");
        String palabra3 = br.readLine();

        // Se convierte la palabra en un Array de Char
        char[] caracter = palabra3.toCharArray();
        boolean palindromo = false;
        // se recorre el array
        for (int i = 0; i < caracter.length/2; i++) {

            //se comprueba si el caracter es igual al de la posicion contraria en todas las posiciones hasta la mitad de la palabra
            if (caracter[i] == caracter[caracter.length - 1 - i] && i != caracter.length/2) {
                palindromo = true;
            }else palindromo = false;
        }


        if (palindromo) {
            System.out.println("La palabra es un palindromo");
        }else System.out.println("la palabra no es un palindromo");
    }
}
