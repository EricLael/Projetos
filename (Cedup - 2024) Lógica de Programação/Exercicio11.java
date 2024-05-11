import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVenda do Eric\n\n" +

                "As maçãs custam R$ 0,30 cada se forem\n" +
                "compradas menos do que uma dúzia, e R$ 0,25\n" +
                "se forem compradas ao menos doze.\n\n" +

                "Quantas maçãs você deseja?");
        int quantidadeM = scanner.nextInt();

        Double precoUnitario;

        if (quantidadeM < 12) {
            precoUnitario = 0.30;
        } else {
            precoUnitario = 0.25;
        }
        Double valorTotal = precoUnitario * quantidadeM;

        System.out.println("\nO valor total da compra é: R$ " + valorTotal);

        scanner.close();
    }
}