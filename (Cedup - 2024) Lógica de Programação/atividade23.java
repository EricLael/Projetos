import java.util.Scanner;
public class atividade23 {
    public static void main(String[] args) {
        Double numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();
        if (numero > 80 || numero < 25 || numero == 40) {
            System.out.println("É o número correto!");
        }
    }
}
