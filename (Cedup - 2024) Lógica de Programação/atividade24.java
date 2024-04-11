import java.util.Scanner;
public class atividade24 {
    public static void main(String[] args) {
        Double e, numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja?");
        e = scanner.nextDouble();
        for (int i = 0; i < e; i++) {
            System.out.println("Qual é o seu primeiro número?");
            numero = scanner.nextDouble();
            if (numero > 0) {
                System.out.println("É positivo!");
            } else if (numero < 0) {
                System.out.println("É negativo!");
            } else {
                System.out.println("É zero!");
            }
        }
    }
}
