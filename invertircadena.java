import java.util.Scanner;

public class invertircadena {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce una cadena de texto: ");
            String texto = scanner.nextLine();
            
            String textoInvertido = new StringBuilder(texto).reverse().toString();
            
            System.out.println("Cadena original: " + texto);
            System.out.println("Cadena invertida: " + textoInvertido);
        }
    }
}