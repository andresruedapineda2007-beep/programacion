import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese dos números:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            System.out.println("Elija operación (+, -, *, /):");
            char op = sc.next().charAt(0);
            
            double r = 0;
            boolean operacionValida = true;
            
            switch (op) {
                case '+' -> r = a + b;
                case '-' -> r = a - b;
                case '*' -> r = a * b;
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Error: división por cero.");
                        return;
                    }
                    r = a / b;
                }
                default -> {
                    System.out.println("Operación no válida.");
                    operacionValida = false;
                }
            }
            
            if (operacionValida) {
                System.out.println("Resultado: " + r);
            }
        }
    }
}

