import javax.swing.JOptionPane;
public class atividade4 {
  public static void main(String[] args) {
  String nome;
  Double venda, salariof, salario, produto, a;

  nome = JOptionPane.showInputDialog(null,"Qual seu nome?");
  salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salario fixo?"));
  venda = Double.parseDouble(JOptionPane.showInputDialog("Quantos você vendeu nesse mês?"));
  produto = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço dos produtos?"));

  a = produto * venda;
  salariof = salario + (a * 0.15);

  JOptionPane.showMessageDialog(null, "Salario final de " + nome + "vai ser: " + salariof + "\nSalario fixo de " + nome + ": " + salario);
  }
}
