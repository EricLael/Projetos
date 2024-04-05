import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double distancia, velocidade;
        double tempo = 0.0;
        int tempom = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é a distância em quilômetros entre o restaurante e o destino do cliente?");
        distancia = scanner.nextDouble();

        System.out.println("\nQual é a velocidade média do entregador em km/h?");
        velocidade = scanner.nextDouble();

        boolean distancial = distancia > 5;
        String mensagem = distancial ? "R$2,00" : "Entrega gratuita";
        
        tempo = distancia / velocidade;
        tempom = (int) tempo * 60;

        System.out.println("\nTempo estimado de entrega: " + tempom + " minutos" +
                           "\nTaxa a ser cobrada: " + mensagem);
    }
}
