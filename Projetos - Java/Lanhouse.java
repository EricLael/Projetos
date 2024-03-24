import javax.swing.JOptionPane;
class Lanhouse {
    public static void main(String[] args) {
        String nome, scanner;
        String mensagem = "";
        int total = 0;
        int tempo = 0;
        int tempop = 0;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        for (;;) {
            scanner = JOptionPane.showInputDialog("Lanhouse do Eric \n\nQuantos horas você deseja? \n\nComputadores Básicos: \n[1] 1 hora - R$ 5,00 \n[2] 2 hora - R$ 8,00 \n\nComputadores Premium: \n[3] 1 hora - R$ 10,00 \n[4] 2 hora - R$ 15,00 \n\nUse [Jogos] para ver quais jogos temos. \n\nUse [Sair] para finalizar.");
            if (scanner.contains("Jogos")) {
                JOptionPane.showMessageDialog(null, "Computadores Básicos: \n\nMinecraft \nStardew Valley \nTerraria \nPlants vs. Zombies \nUndertale \nLimbo \nHotline Miami \nBastion \nFez \nSuper Meat Boy \n\nComputadores Premium: \n\nTodos os jogos do básico \n\nCyberpunk 2077 \nRed Dead Redemption 2 \nAssassin's Creed Valhalla \nCall of Duty: Warzone \nDOOM Eternal \nThe Witcher 3: Wild Hunt \nValorant \nApex Legends \nMonster Hunter: World \nControl");
            }
            if (scanner.contains("Sair")) {
                break;
            }
            if (scanner.contains("1")) {
                total += 5;
                tempo += 1;
                mensagem += "Básico 1 hora - R$ 5,00\n";
            }
            if (scanner.contains("2")) {
                total += 8;
                tempo += 2;
                mensagem += "Básico 2 hora - R$ 8,00\n";
            }
            if (scanner.contains("3")) {
                total += 10;
                tempop += 1;
                mensagem += "Premium 1 hora - R$ 10,00\n";
            }
            if (scanner.contains("4")) {
                total += 15;
                tempop += 2;
                mensagem += "Premium 2 hora - R$ 15,00\n";
            }
        }
        if (tempo == 0) {
            JOptionPane.showInputDialog("Sacola de compras\n\n" + nome + " escolheu o serviço Premium, ele poderá usar os computadores por " + tempop + " horas. \n\nO total de sua conta ficou em " + total + " reais. \n\nItens: \n" + mensagem + "\n\nQual é a forma de pagamento? \n\n[1] Cartão de Crédito \n[2] Cartão de Débito \n[3] Dinheiro");
            JOptionPane.showMessageDialog(null, "Obrigado por escolher nossos serviços! :)");
        }
        if (tempop == 0) {
            JOptionPane.showInputDialog("Sacola de compras\n\n" + nome + " escolheu o serviço Básico, ele poderá usar os computadores por " + tempo + " horas. \n\nO total de sua conta ficou em " + total + " reais. \n\nItens: \n" + mensagem + "\n\nQual é a forma de pagamento? \n\n[1] Cartão de Crédito \n[2] Cartão de Débito \n[3] Dinheiro");
            JOptionPane.showMessageDialog(null, "Obrigado por escolher nossos serviços! :)");
        }
        if (tempop >= 1 && tempo >= 1) {
            JOptionPane.showInputDialog("Sacola de compras\n\n" + nome + " escolheu tanto o serviço Básico quanto o serviço Premium! \n\nEle poderá usar os computadores Básicos por " + tempo + " horas, \ne também poderá usar os computadores Premium por " + tempop + " horas. \n\nO total de sua conta ficou em " + total + " reais. \n\nItens: \n" + mensagem + "\n\nQual é a forma de pagamento? \n\n[1] Cartão de Crédito \n[2] Cartão de Débito \n[3] Dinheiro");
            JOptionPane.showMessageDialog(null, "Obrigado por escolher nossos serviços! :)");
        }
    }
}
