import javax.swing.JOptionPane;
class Calculadora {
    public static void main(String[] args) {
    String leia;
    int n1, n2, a, s, d, m;

    for (int i = 1; i < 11;) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o primeiro número?"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o segundo número?"));
        leia = JOptionPane.showInputDialog("Qual é o tipo do calculo? \n\nAdição (a) \nSubtração (s) \nDivisão (d) \nMultiplicação (m)");
        if (leia.contains("a")) {
        a = n1 + n2;
        JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + a);
        }
        if (leia.contains("s")) {
        s = n1 - n2;
        JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + s);
        }
        if (leia.contains("d")) {
        d = n1 / n2;
        JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + d);
        }
        if (leia.contains("m")) {
        m = n1 * n2;
        JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + m); 
            }
        }
    }
}
