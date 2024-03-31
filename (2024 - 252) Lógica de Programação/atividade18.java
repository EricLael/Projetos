import javax.swing.JOptionPane;
public class atividade18 {
    public static void main(String[] args) {
    Double[] leia = new Double[75];

    for (int i = 0; i < 75; i++) {
    leia[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade."));
    if (leia[i] < 18) {
        JOptionPane.showMessageDialog(null, "Você é menor de idade.");
    }
    else if (leia[i] >= 18) {
        JOptionPane.showMessageDialog(null, "Você é maior de idade.");
            }
        }
    }
}
