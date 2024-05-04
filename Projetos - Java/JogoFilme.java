import java.util.Scanner;
public class JogoFilme {
    
    Scanner scanner = new Scanner(System.in);
    
    String leitor, filme;
    String[] pistas = new String[5];
    int pontuacao = 0;

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
        // Pista 1
        System.out.println("A primeira pista é: " + pistas[0]);
        leitor = scanner.nextLine().toLowerCase();
        if (leitor.equals(filme)) {
            pontuacao = 100;
            System.out.println("Você acertou! \n" +
                               "Sua pontuação ficou em: " + pontuacao + " pontos.");
            return;
        }
        // Pista 2
        System.out.println("A segunda pista é: " + pistas[1]);
        leitor = scanner.nextLine().toLowerCase();
        if (leitor.equals(filme)) {
            pontuacao = 75;
            System.out.println("Você acertou! \n" +
                               "Sua pontuação ficou em: " + pontuacao + " pontos.");
            return;
        }
        // Pista 3
        System.out.println("A terceira pista é: " + pistas[2]);
        leitor = scanner.nextLine().toLowerCase();
        if (leitor.equals(filme)) {
            pontuacao = 50;
            System.out.println("Você acertou! \n" +
                               "Sua pontuação ficou em: " + pontuacao + " pontos.");
            return;
        }
        // Pista 4
        System.out.println("A quarta pista é: " + pistas[3]);
        leitor = scanner.nextLine().toLowerCase();
        if (leitor.equals(filme)) {
            pontuacao = 25;
            System.out.println("Você acertou! \n" +
                               "Sua pontuação ficou em: " + pontuacao + " pontos.");
            return;
        }
        // Pista 5
        System.out.println("A quinta pista é: " + pistas[4]);
        leitor = scanner.nextLine().toLowerCase();
        if (leitor.equals(filme)) {
            pontuacao = 10;
            System.out.println("Você acertou! \n" +
                               "Sua pontuação ficou em: " + pontuacao + " pontos.");
            return;
        }
        System.out.println("Você errou todas!");
        System.out.println("Sua pontuação ficou em: " + pontuacao + " pontos.");
    }
    public static void main(String[] args) {
        JogoFilme comunicador = new JogoFilme();
        comunicador.filme();
        comunicador.pistas();
        comunicador.separador();
        comunicador.jogador2();
    }
}
