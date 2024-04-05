import javax.swing.JOptionPane;
public class atividade12 {
  public static void main(String[] args) {
  Double r, p, c;

  c = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço de custo do carro?"));
    
  p = c + (c*0.45);
  r = p + (p*0.28);

  JOptionPane.showMessageDialog(null,"O valor de venda é de " + r);
  }
}
