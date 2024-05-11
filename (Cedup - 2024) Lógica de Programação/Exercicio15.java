import java.util.Scanner;

public class Exercicio15 {

    Scanner scanner = new Scanner(System.in);

    String leitor, filme;
    String[] pistas = new String[5];
    int pontuacao;

    // Jogador 1
    public void pistas() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual é " + (i + 1) + " pista?");
            pistas[i] = scanner.nextLine();
        }
    }

    public void filme() {
        System.out.println("Qual é o nome do filme?");
        filme = scanner.nextLine().toLowerCase();
    }

    public void separador() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    // Jogador 2
    public void jogador2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A " + (i + 1) + " pista é: " + pistas[i]);
            leitor = scanner.nextLine().toLowerCase();
            pontuacao = 100 - (20 * i);
            if (leitor.equals(filme)) {
                pontuacao();
                return;
            }
        }
        System.out.println("Você errou todas.");
    }

    public void pontuacao() {
        System.out.println("Você acertou! \n" +
                "Sua pontuação é de: " + pontuacao + " pontos");
    }

    public static void main(String[] args) {
        Exercicio15 comunicador = new Exercicio15();
        comunicador.filme();
        comunicador.pistas();
        comunicador.separador();
        comunicador.jogador2();
    }
}