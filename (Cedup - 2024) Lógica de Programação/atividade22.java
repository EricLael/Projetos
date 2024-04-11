import java.util.Scanner;
public class atividade22 {
    public static void main(String[] args) {
        Double[] precoC = new Double[41];
        Double[] precoV = new Double[41];
        Double calculo = 0.0;
        Double total = 0.0;
        Double total2 = 0.0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 41; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            precoC[i] = scanner.nextDouble();
            System.out.print("Digite o preço a ser vendido: ");
            precoV[i] = scanner.nextDouble();
        calculo = precoV[i] - precoC[i];
        if (calculo > 0.0) {
            total += calculo;
        } else {
            total2 += calculo;
        }
        }
        if (total > 0.0) {
            System.out.println("Lucro: " + total);
        } else if (total2 < 0.0) {
            System.out.println("Prejuízo: " + total2);
        } else {
            System.out.println("Empatou");
        }
    }
}