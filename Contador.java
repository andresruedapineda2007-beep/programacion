import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine();
            
            int contadorVocales = 0;
            int contadorConsonantes = 0;
            
            for (char letra : palabra.toCharArray()) {
                if (esVocal(letra)) {
                    contadorVocales++;
                } else if (esConsonante(letra)) {
                    contadorConsonantes++;
                }
            }
            
            System.out.println("Número de vocales: " + contadorVocales);
            System.out.println("Número de consonantes: " + contadorConsonantes);
        }
    }

    private static boolean esVocal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }

    private static boolean esConsonante(char letra) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(letra) != -1;
    }
}