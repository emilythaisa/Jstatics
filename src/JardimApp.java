import javax.swing.JOptionPane;

public class JardimApp {
    public static void main(String[] args) {
        // NÍVEL 1 - PARTE I
        JOptionPane.showMessageDialog(null, "Alô, Jardim!");

        // NÍVEL 1 - PARTE 2
        String nome = JOptionPane.showInputDialog(null, "SEJA BEM VINDO (A)\nDigite seu nome:");
        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço:");

        JOptionPane.showMessageDialog(null, "Cadastro realizado!\nNome: " + nome + "\nEndereço: " + endereco);

        // NÍVEL 1 - PARTE 3
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do seu jardim \n METROS:"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do seu jardim \n METROS:"));
        double area = largura * comprimento;
        JOptionPane.showMessageDialog(null, "Área do jardim: " + area + " m²");

  } 

   }
   