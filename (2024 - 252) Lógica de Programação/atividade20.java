import javax.swing.JOptionPane;
class atividade20{
    public static void main(String[] args){
        Double v,ano,venda;
        
        v = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do carro?"));
        ano = Double.parseDouble(JOptionPane.showInputDialog("Qual o ano do carro?"));
        if (ano<= 2000) {
            venda= v - (v*0.12);
            JOptionPane.showMessageDialog(null, "Valor do carro vai ser: " + venda);
        }
        if (ano>2000) {
            venda= v - (v*0.07);
            JOptionPane.showMessageDialog(null, "Valor do carro vai ser: " + venda);
        }
    }
}
