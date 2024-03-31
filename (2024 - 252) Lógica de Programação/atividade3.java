import javax.swing.JOptionPane;
public class atividade3 {
  public static void main(String[] args){
  Double kmf, li, lf, total;

  kmf = Double.parseDouble(JOptionPane.showInputDialog("Qual a quilometragem percorrida?"));
  li = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tinham no inicío?"));
  lf = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tinham no final?"));

  total = kmf/(li-lf); 
  
  JOptionPane.showMessageDialog(null, "A media kilometrica é de " + total);
  }
}