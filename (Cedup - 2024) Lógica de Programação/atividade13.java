import javax.swing.JOptionPane;
public class atividade13 {
  public static void main(String[] args) {
  Double n;

  n = Double.parseDouble(JOptionPane.showInputDialog("Qual o número?"));
  if (n < 10) {
  }
  else if (n >= 10) {
  JOptionPane.showMessageDialog(null, "Seu número é: " + n);
  }

  }
}
