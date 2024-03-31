import javax.swing.JOptionPane;
public class atividade14 {
  public static void main(String[] args) {
  Double n1, n2;

  n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro número?"));
  n2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o segundo número?"));
  if (n1 < n2) {
    JOptionPane.showMessageDialog(null, " n1: " + n2 + " É o número maior!");
  }
  if (n2 < n1) {
    JOptionPane.showMessageDialog(null, " n1: " + n1 + " É o número maior!");
  }
  }
}
