import javax.swing.JOptionPane;

public class Mercado2 {
    public static void main(String[] args) {
        String nome, scanner;
        String mensagem = "";
        int total = 0;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        for (;;) {
            scanner = JOptionPane.showInputDialog("Mercado do Eric \n\nEscolha itens do seu carrinho de compras: \n\n[1] Arroz (1 kg) - R$ 5,00 \n[2] Feijão (1 kg) - R$ 6,00 \n[3] Óleo de cozinha (900 ml) - R$ 7,00 \n[4] Leite (1 litro) - R$ 3,50 \n[5] Ovos (dúzia) - R$ 8,00 \n[6] Carne bovina (1 kg) - R$ 30,00 \n[7] Frango (1 kg) - R$ 10,00 \n[8] Macarrão (500 g) - R$ 4,00 \n[9] Tomate (1 kg) - R$ 4,00 \n[10] Batata (1 kg) - R$ 3,50 \n\nDigite [Sair] para finalizar sua compra!");
            if (scanner.contains("Sair")) {
                break;
            }
            if (scanner.contains("1")) {
                total += 5;
                mensagem += "Arroz (1 kg) - R$ 5,00\n";
            }
            if (scanner.contains("2")) {
                total += 6;
                mensagem += "Feijão (1 kg) - R$ 6,00\n";
            }
            if (scanner.contains("3")) {
                total += 6;
                mensagem += "Óleo de cozinha (900 ml) - R$ 7,00\n";
            }
            if (scanner.contains("4")) {
                total += 3;
                mensagem += "Leite (1 litro) - R$ 3,50\n";
            }
            if (scanner.contains("5")) {
                total += 8;
                mensagem += "Ovos (dúzia) - R$ 8,00\n";
            }
            if (scanner.contains("6")) {
                total += 30;
                mensagem += "Carne bovina (1 kg) - R$ 30,00\n";
            }
            if (scanner.contains("7")) {
                total += 10;
                mensagem += "Frango (1 kg) - R$ 10,00\n";
            }
            if (scanner.contains("8")) {
                total += 4;
                mensagem += "Macarrão (500 g) - R$ 4,00\n";
            }
            if (scanner.contains("9")) {
                total += 4;
                mensagem += "Tomate (1 kg) - R$ 4,00\n";
            }
            if (scanner.contains("10")) {
                total += 3.50;
                mensagem += "Batata (1 kg) - R$ 3,50\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
        JOptionPane.showInputDialog("O total da conta de " + nome + " ficou em " + total + " reais. \n\nQual a forma de pagamento? \n\n[1] Cartão de Crédito \n[2] Cartão de Débito \n[3] Dinheiro \n\n");
        JOptionPane.showMessageDialog(null, "Obrigado por escolher nossos serviços! :)");
    }
}