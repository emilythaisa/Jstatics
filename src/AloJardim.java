import javax.swing.JOptionPane;

public class AloJardim {
    public static void main(String[] args) {
        // Parte 1 
        JOptionPane.showMessageDialog(null, "Alô, Jardim!");

        // Parte 2 
        String nome = JOptionPane.showInputDialog(null,  "SEJA BEM VINDO (A)\nDigite seu nome:");
        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço:");

        JOptionPane.showMessageDialog(null, "Cadastro realizado!\nNome: " + nome + "\nEndereço: " + endereco);

        // Parte 3 
        int resposta = JOptionPane.NO_OPTION;

        while (resposta != JOptionPane.YES_OPTION) {
            String largurajardin = JOptionPane.showInputDialog(null, "Digite a largura do jardim (em metros):");
            String comprimentojardin = JOptionPane.showInputDialog(null, "Digite o comprimento do jardim (em metros):");

            double largura = Double.parseDouble(largurajardin);
            double comprimento = Double.parseDouble(comprimentojardin);
            double area = largura * comprimento;

            resposta = JOptionPane.showConfirmDialog(null,"A área do seu jardim é " + area + " m². \nNÉ?","Vamos confirmar", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Obrigada pela informação!");
    }
}
        
        




        



