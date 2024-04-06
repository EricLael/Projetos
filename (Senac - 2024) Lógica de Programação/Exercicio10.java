// Exercicio 5 melhorada
import javax.swing.JOptionPane;
public class Exercicio10 {
    public static void main(String[] args) {
       
    double distancia = Double.parseDouble(JOptionPane.showInputDialog("Qual é a distância em quilômetros entre o restaurante e o destino do cliente?"));
    double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Qual é a velocidade média do entregador em km/h?"));

    boolean distancial = distancia > 5;
    String mensagem = distancial ? "R$2,00" : "Entrega gratuita";

    double tempo = distancia / velocidade;
    int tempom = (int) tempo * 60;

    JOptionPane.showMessageDialog(null, "\nTempo estimado de entrega: " + tempom + " minutos" +
                                                        "\nTaxa a ser cobrada: " + mensagem);
    }
}