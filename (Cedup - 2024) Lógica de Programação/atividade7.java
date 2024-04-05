import javax.swing.JOptionPane;
public class atividade7 {
  public static void main(String[] args) {
  Double c, f;

  c = Double.parseDouble(JOptionPane.showInputDialog("Quantos graus célcius?"));
    
  f = (9*c+160)/5;

  JOptionPane.showMessageDialog(null, "Graus em Célcius: " + c + "\nGraus  em Fahrenheit: "+ f);
  }
}
