import javax.swing.JOptionPane;
import java.util.Scanner;

public class AloJardim {
    public static void main(String[] args) {
        //NÍVEL 1
        // Parte 1
        JOptionPane.showMessageDialog(null, "Alô, Jardim!");

        // Parte 2
        String nome = JOptionPane.showInputDialog(null,  "SEJA BEM VINDO (A)\nDigite seu nome:");
        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço:");

        JOptionPane.showMessageDialog(null, "Cadastro realizado!\nNome: " + nome + "\nEndereço: " + endereco);

        // Parte 3
        int resposta = JOptionPane.NO_OPTION;

        while (resposta != JOptionPane.YES_OPTION) {
            String largurajardin = JOptionPane.showInputDialog(null, "Digite a largura do seu jardim (em metros):");
            String comprimentojardin = JOptionPane.showInputDialog(null, "Digite o comprimento do seu jardim (em metros):");

            double largura = Double.parseDouble(largurajardin);
            double comprimento = Double.parseDouble(comprimentojardin);
            double area = largura * comprimento;

            resposta = JOptionPane.showConfirmDialog(null,"A área do seu jardim é " + area + " m². \nNÉ?","Vamos confirmar", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Obrigada pela informação!");

        //NÍVEL 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do jardim (em metros quadrados): ");
        int tamanhoJardim = scanner.nextInt();
        String tamanhoClassificado;

        if (tamanhoJardim > 100) {
            tamanhoClassificado = "Grande";
        } else {
            tamanhoClassificado = "Pequeno";
        }
        System.out.println("Seu jardim é: " + tamanhoClassificado);


        System.out.println("\nO que você deseja fazer?");
        System.out.println("1 - Jardinagem");
        System.out.println("2 - Podagem");
        System.out.println("3 - Paisagismo");
        System.out.print("Digite o número do serviço desejado: ");
        int tipoServico = scanner.nextInt();
        String descricaoServico;

        switch (tipoServico) {
            case 1:
                descricaoServico = "Manutenção e cuidados básicos - JARDINAGEM?";
                break;
            case 2:
                descricaoServico = "Corte e cuidados com as plantas.";
                break;
            case 3:
                descricaoServico = "Comprar ";
                break;
            default:
                descricaoServico = "Opção inválida!";
        }
        System.out.println(descricaoServico);

        // Desconto por fidelidade
        System.out.print("\nQuantos serviços já foram realizados? ");
        int quantidadeServicos = scanner.nextInt();
        double desconto = 0.0;

        if (quantidadeServicos >= 5) {
            desconto = 0.10; // 10% de desconto para 5 ou mais serviços
        } else if (quantidadeServicos >= 3) {
            desconto = 0.05; // 5% de desconto para 3 ou mais serviços
        }

        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        scanner.close();
    }
}