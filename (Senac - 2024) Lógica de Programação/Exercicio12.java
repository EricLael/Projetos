import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o valor do primeiro ângulo do triângulo:");
        int angulo1 = scanner.nextInt();

        System.out.println("\nInforme o valor do segundo ângulo do triângulo:");
        int angulo2 = scanner.nextInt();

        System.out.println("\nInforme o valor do terceiro ângulo do triângulo:");
        int angulo3 = scanner.nextInt();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("\nSeu triângulo é um Triângulo Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("\nSeu triângulo é um Triângulo Obtusângulo");
        } else {
            System.out.println("\nSeu triângulo é um Triângulo Acutângulo");
        }

        scanner.close();
    }
}