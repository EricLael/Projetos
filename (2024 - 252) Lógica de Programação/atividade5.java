import javax.swing.JOptionPane;
public class atividade5 {
  public static void main(String[] args) {
  String nome;
  Double nota1, nota2, nota3, r;

  nome = JOptionPane.showInputDialog("Qual o seu nome?");
    
  nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua primeira nota?"));
  nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua segunda nota?"));
  nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua terceira nota?"));
    
  r = (nota1 + nota2 + nota3)/3;
    
  JOptionPane.showMessageDialog(null, "Nome: " + nome + " \nMedia final: " + r);
  }
}
