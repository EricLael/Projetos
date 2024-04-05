import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String produto;
        double preco, quantidade;
        double conta1 = 0;
        double conta2 = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o nome do produto?");
        produto = scanner.nextLine();

        System.out.println("\nQuanto custa o produto: " + produto);
        preco = scanner.nextDouble();

        System.out.println("\nQuantas unidades você deseja?");
        quantidade = scanner.nextDouble();
        scanner.nextLine();

        conta1 = preco * quantidade;
        conta2 = conta1 * 0.20;
        total = conta1 - conta2;

        System.out.println("\nInformações:\n" + 
                           "---------------------------" +
                           "\nProduto: " + produto +
                           "\nPreço: " + preco +
                           "\nQuantidade: " + quantidade +
                           "\nTotal: " + conta1 +
                           "\nTotal com desconto 20%: " + total +
                           "\n\nQual a forma de pagamento?");
                           scanner.nextLine();

        System.out.println("\nObrigado pela preferência!");
    }
}