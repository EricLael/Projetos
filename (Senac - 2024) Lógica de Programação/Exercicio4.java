import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
    String nome;
    double nota1, nota2, nota3;
    double media;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nQual é o seu nome?");
    nome = scanner.nextLine();

    System.out.println("\nQual é sua primeira nota?");
    nota1 = scanner.nextDouble();

    System.out.println("\nQual é sua segunda nota?");
    nota2 = scanner.nextDouble();

    System.out.println("\nQual é sua terceira nota?");
    nota3 = scanner.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;
    boolean medial = media >= 6;
    String mensagem = medial ? "foi aprovado!" : "foi reprovado!";

    System.out.println("\nA media do aluno " + nome + " ficou em " + media + ", ele " + mensagem);
    }
}