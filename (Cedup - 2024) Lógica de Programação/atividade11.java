import javax.swing.JOptionPane;
public class atividade11 {
  public static void main(String[] args) {
  Double c, p, v;
  
  c = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de custo?"));
  p = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de lucro?"));

  v = c+(c* (p/100));

  JOptionPane.showMessageDialog(null,"O valor de venda é de" + v);
  }
}