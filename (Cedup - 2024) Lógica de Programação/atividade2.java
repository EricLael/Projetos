import java.util.Scanner;
public class atividade2 {
  public static void main(String[] args) {
  String leia;
  Double n1, n2, a, s, d, m;
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("\n\nQual é o primeiro número?");
  n1 = scanner.nextDouble();

  System.out.println("\n\nQual é o segundo número?");
  n2 = scanner.nextDouble();
  scanner.nextLine();

  System.out.println("\n\nQual é o tipo da operação? \n[a] Adição \n[s] Subtração \n[d] Divisão \n[m] Multiplicação");
  leia = scanner.nextLine();
  if (leia.contains("a")) {
    a = n1 + n2;
    System.out.printf("\nA soma de " + n1 + " + " + n2 + " é: " + a);
  }
  else if (leia.contains("s")) {
    s = n1 - n2;
    System.out.printf("\nA subtração de " + n1 + " - " + n2 + " é: " + s);
  }
  else if (leia.contains("d")) {
    d = n1 / n2;
    System.out.printf("\nA divisão de " + n1 + " / " + n2 + " é: " + d);
  }
  else if (leia.contains("m")) {
    m = n1 * n2;
    System.out.printf("\nA multiplicação de " + n1 + " x " + n2 + " é: " + m);
  }
  }
}