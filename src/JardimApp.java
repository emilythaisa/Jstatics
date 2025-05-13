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

        //---------------------------------------------------------------------------------------------------
        // NÍVEL 2 - ESTRUTURA DE SELEÇÃO- TAMANHO DO JARDIM
        if (area > 100) {
            JOptionPane.showMessageDialog(null, "Jardim grande, né? \nAinda bem :)");
        } else {
            JOptionPane.showMessageDialog(null, "Jardim pequeno :D");
        }

        // NÍVEL 2 - TIPO DE SERVIÇO
        String Servico = JOptionPane.showInputDialog("Qual serviço deseja? \n1 - Jardinagem\n2 - Adubação\n3 - Comprar plantinhas.");
        switch (Servico) {
            case "1":
                JOptionPane.showMessageDialog(null, "Serviço escolhido: Jardinagem");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Serviço escolhido: Adubação");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Serviço escolhido: Plantinhas novas");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }

        // DESCONTO POR FIDELIDADE
        int qtdServicos = Integer.parseInt(JOptionPane.showInputDialog("Leve mais pagando menos! \nDeseja quantos serviços? \nDigite 1-3"));
        double desconto;
        if (qtdServicos >= 2) {
            desconto = 0.15;
        } else {
            desconto = 0.0;
        }
        JOptionPane.showMessageDialog(null, "Desconto aplicado: " + (desconto * 100) + "%");

        //---