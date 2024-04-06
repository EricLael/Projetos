// Exercicio 3 melhorada
import javax.swing.JOptionPane;
public class Exercicio8 {
    public static void main(String[] args) {
        
    String produto = JOptionPane.showInputDialog("Qual é o nome do produto?");
    Double preco = Double.parseDouble(JOptionPane.showInputDialog("Quanto custa o produto: " + produto + "?"));
    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades você deseja?"));
    Double desconto = Double.parseDouble(JOptionPane.showInputDialog("Quanto desconto você quer (em decimal, ex: 0,20 para 20%)?"));

    Double total = preco * quantidade;
    Double desconto2 = total * desconto;
    Double total2 = total - desconto2;

    JOptionPane.showInputDialog("\nInformações:\n" + 
                                  "---------------------------" +
                                  "\nProduto: " + produto +
                                  "\nPreço: " + preco +
                                  "\nQuantidade: " + quantidade +
                                  "\nDesconto: " + (desconto * 100) + "%" +
                                  "\nTotal com desconto: " + total2 +
                                  "\n\nQual a forma de pagamento?");
    
    JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
    }
}