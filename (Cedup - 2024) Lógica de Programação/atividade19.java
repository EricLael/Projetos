import javax.swing.JOptionPane;
public class atividade19 {
    public static void main(String[] args) {
    String scanner;
    String[] nome = new String[56];
    Double mulher = 0.0;
    Double homem = 0.0;

    for (int i = 0; i < 5; i++) {
        nome[i] = JOptionPane.showInputDialog("Qual é o seu nome?");
        scanner = JOptionPane.showInputDialog("Qual é o seu gênero? \n\n[1] Mulher \n[2] Homem");
        if (scanner.contains("1")) {
            mulher += 1;
        }
        if (scanner.contains("2")) {
            homem += 1;
        }
    }

    JOptionPane.showMessageDialog(null, "São: \n\n" + mulher + " mulheres e " + homem + " homens.");

    }
}