import javax.swing.JOptionPane;
public class atividade8{
  public static void main(String[] args) {
  Double real, dolar;

  real = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor solicitado?"));

  dolar = real / 5;
    
  JOptionPane.showMessageDialog(null, "O valor em dolar é "+ dolar);
  }
}