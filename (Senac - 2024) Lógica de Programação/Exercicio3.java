import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String produto;
        double preco, quantidade;
        double desconto;
        double total = 0;
        double total2 = 0;
        double total3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o nome do produto?");
        produto = scanner.nextLine();

        System.out.println("\nQuanto custa o produto: " + produto);
        preco = scanner.nextDouble();

        System.out.println("\nQuantas unidades você deseja?");
        quantidade = scanner.nextDouble();
        
        System.out.println("\nQuanto desconto você quer (em decimal, ex: 0,20 para 20%)?");
        desconto = scanner.nextDouble();
        scanner.nextLine();

        total = preco * quantidade;
        total2 = total * desconto;
        total3 = total - total2;

        System.out.println("\nInformações:\n" + 
                           "---------------------------" +
                           "\nProduto: " + produto +
                           "\nPreço: " + preco +
                           "\nQuantidade: " + quantidade +
                           "\nTotal: " + total +
                           "\nTotal com desconto de " + (desconto * 100) + "%: " + total3 +
                           "\n\nQual a forma de pagamento?");
                           scanner.nextLine();

        System.out.println("\nObrigado pela preferência!");
    }
}
