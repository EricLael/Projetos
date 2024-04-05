import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto;
        double preco, quantidade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome do produto:");
        produto = scanner.nextLine();

        System.out.println("\nDigite o preço do produto " + produto + ":");
        preco = scanner.nextDouble();

        System.out.println("\nDigite a quantidade disponível em estoque:");
        quantidade = scanner.nextDouble();
        
        System.out.println("\nInformações do Produto:\n" + 
                           "---------------------------" +
                           "\nProduto: " + produto +
                           "\nPreço: " + preco +
                           "\nQuantidade: " + quantidade);
    }
}