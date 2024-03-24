import javax.swing.JOptionPane;
class Mercado{
    public static void main(String[] args) {
        String[] produto = new String[11];
        String nome;
        int[] valor = new int[11];
        int[] quantidade = new int[11];
        int total = 0;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        for (int i = 1; i < 11; i++) {
            produto[i] = JOptionPane.showInputDialog("Qual é o seu " + i + "º produto?");
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de: " + produto[i] + "?"));
            quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantos você deseja?"));
            total += valor[i] * quantidade[i];
        }
        String mensagem = "";
        for (int j = 1; j < 11; j++){
            mensagem += "Produto: " + produto[j] + " | Valor: " + valor[j] + " | Quantidade: " + quantidade[j] + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
        JOptionPane.showMessageDialog(null, "O total da conta de " + nome + " ficou em " + total + ".");
    }
}
