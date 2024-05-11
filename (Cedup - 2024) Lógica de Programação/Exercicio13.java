import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o primeiro número?");
        Double numero1 = scanner.nextDouble();

        System.out.println("\nQual é o segundo número?");
        Double numero2 = scanner.nextDouble();

        System.out.println("\nQual é o tipo da operação?\n\n" +
                           
                           "[1] Soma\n" +
                           "[2] Subtração\n" +
                           "[3] Divisão\n" +
                           "[4] Multiplicação");
                           int leitor = scanner.nextInt();
        
        Double calculo = 0.0;

        switch (leitor) {
            case 1:
            calculo = numero1 + numero2;
            System.out.println("\nO resultado da soma de: " + numero1 + " + " + numero2 + " é: " + calculo);
            break;
            case 2:
            calculo = numero1 - numero2;
            System.out.println("\nO resultado da subtração de: " + numero1 + " - " + numero2 + " é: " + calculo);
            break;
            case 3:
            calculo = numero1 / numero2;
            System.out.println("\nO resultado da divisão de: " + numero1 + " / " + numero2 + " é: " + calculo);
            break;
            case 4:
            calculo = numero1 * numero2;
            System.out.println("\nO resultado da multiplicação de: " + numero1 + " * " + numero2 + " é: " + calculo);
            break;
            default:
            System.out.println("\nOpção inválida!");
        }

        scanner.close();
    }
}