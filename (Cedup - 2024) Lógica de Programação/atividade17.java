import javax.swing.JOptionPane;
public class atividade17 {
    public static void main(String[] args) {
    Double[] leia = new Double[80];
    StringBuilder armazena = new StringBuilder();
    
    for (int i = 0; i < 80; i++){
      leia[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu número."));
    if (leia[i] >= 10 && leia[i] <= 150) {
      armazena.append(leia[i]).append("\n");
        }
      }
    JOptionPane.showMessageDialog(null, armazena);
    }
}