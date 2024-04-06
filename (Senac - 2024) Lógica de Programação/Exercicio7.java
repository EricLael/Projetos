// Exercicio 2 melhorado
import javax.swing.JOptionPane;
public class Exercicio7 {
    public static void main(String[] args) {
    
    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));
    String filhos = JOptionPane.showInputDialog("Você tem filhos?");
    boolean filhosb = filhos.equalsIgnoreCase("Sim");
    String mensagem = filhosb ? "Possue" : "Não possue";

    JOptionPane.showMessageDialog(null, "Informações do Cliente:\n" +
                                                        "---------------------------" +
                                                        "\nCliente: " + nome +
                                                        "\nIdade: " + idade +
                                                        "\nSalario: " + salario +
                                                        "\nFilhos: " + mensagem);
    }
}