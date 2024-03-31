import javax.swing.JOptionPane;
public class atividade6 {
  public static void main(String[] args) {
  int a, b, c, d;

  a = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de A?"));
  b = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de B?"));
  
  c = a;
  d = b;

  JOptionPane.showMessageDialog(null, "A: " + c + " \nB: " + d);
  }
}
