// Exercicio 1 melhorado
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {

        String produto = JOptionPane.showInputDialog("Qual é o nome do produto?");
        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço do produto " + produto + "?"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponível em estoque"));

        JOptionPane.showMessageDialog(null, "Informações do produto:\n" +
                "---------------------------" +
                "\nProduto: " + produto +
                "\nPreço: " + preco +
                "\nQuantidade: " + quantidade);
    }
}