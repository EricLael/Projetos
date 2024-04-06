// Exercicio 4 melhorada
import javax.swing.JOptionPane;
public class Exercicio9 {
    public static void main(String[] args) {
    
    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
    Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua primeira nota?"));
    Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua segunda nota?"));
    Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua terceira nota?"));
    Double media = (nota1 + nota2 + nota3) / 3;
    boolean medial = media >= 6;
    String mensagem = medial ? "Foi aprovado!" : "Foi reprovado!";
    JOptionPane.showMessageDialog(null, "O aluno " + nome + " ficou com a média: " + media + " e " + mensagem);
    }
}