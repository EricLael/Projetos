import java.util.Scanner;
public class atividade1 {
  public static void main(String[] args) {
  Double n1, n2, total;
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("\n\nQual é o primeiro número?");
  n1 = scanner.nextDouble();

  System.out.println("\n\nQual é o segundo número?");
  n2 = scanner.nextDouble();

  total = n1 + n2;

  System.out.println("\n\nO total de " + n1 + " + " + n2 + " é: " + total);
  }
}