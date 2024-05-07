import javax.swing.JOptionPane;
public class Calculadora2 {
    Double n1, n2;
    void Numeros() {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro número?"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo número?"));
    }

    String[] opcoes = {"Adição", "Subtração", "Divisão", "Multiplicação"};
    Object leitor;

    void TipoOperação() {
        leitor = JOptionPane.showInputDialog(null, "Qual é o tipo da operação?", "Operação", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
    }
    void Resultado() {
        if (leitor.equals("Adição")) {
            JOptionPane.showMessageDialog(null, (n1 + n2));
        } else if (leitor.equals("Subtração")) {
            JOptionPane.showMessageDialog(null, (n1 - n2));
        } else if (leitor.equals("Divisão")) {
            JOptionPane.showMessageDialog(null, (n1 / n2));
        } else if (leitor.equals("Multiplicação")) {
            JOptionPane.showMessageDialog(null, (n1 * n2));
        }
    }
    public static void main(String[] args) {
        Calculadora2 comunicador = new Calculadora2();

        comunicador.Numeros();
        comunicador.TipoOperação();
        comunicador.Resultado();
    }
}