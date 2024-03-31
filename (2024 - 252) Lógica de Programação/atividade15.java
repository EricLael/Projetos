import javax.swing.JOptionPane;
public class atividade15 {
  public static void main(String[] args) {
  Double n1;

  n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número?"));
  if (n1 >= 100 && n1 <= 200) {
    JOptionPane.showMessageDialog(null, n1 + " Está entre 100 e 200!");
  }
  else if (n1 > 200 || n1 < 100 ) {
    JOptionPane.showMessageDialog(null, n1 + " Não está entre 100 e 200!");
    }
  }
}

