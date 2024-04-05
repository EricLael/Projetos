import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        boolean filhos;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("\nQual é o seu nome?");
        nome = scanner.nextLine();
        
        System.out.println("\nQuantos anos você tem?");
        idade = scanner.nextInt();
        
        System.out.println("\nQual é o seu salário?");
        salario = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("\nVocê possui filhos? (Sim/Não)");
        String respostaFilhos = scanner.nextLine();

        filhos = respostaFilhos.equalsIgnoreCase("Sim");

        System.out.println("\nInformações do Cliente:\n" +
                           "---------------------------\n" +
                           "Nome: " + nome + "\n" +
                           "Idade: " + idade + "\n" +
                           "Salário: " + salario + "\n" +
                           "Possui Filhos: " + (filhos ? "Sim" : "Não"));
    }
}