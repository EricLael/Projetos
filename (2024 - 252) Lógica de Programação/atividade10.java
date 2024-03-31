import javax.swing.JOptionPane;
public class atividade10 {
  public static void main(String[] args) {
  Double v, p;

  v = Double.parseDouble(JOptionPane.showInputDialog("Loja Mamão com Açúcar \n\nQual o valor do produto?"));

  p = v/5;

  JOptionPane.showMessageDialog(null, "O valor das prestações é: " + p);
  }
}
