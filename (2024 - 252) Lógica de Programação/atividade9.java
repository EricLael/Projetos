import javax.swing.JOptionPane;
public class atividade9 {
  public static void main(String[] args) {
  Double v, r, m;

  v = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor que você deseja depositar?"));
  m = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos mêses vocês deseja deixar?"));

  r = v + (v * 0.070 * m);

  JOptionPane.showMessageDialog(null, "Rendimento: " + r);
  }
}
