import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("JStatistics");
        //Aplicando Lógica de Programação (Aristoteles e George Boolean)
        Scanner leia = new Scanner (System.in);
        // variável: é um espaço reservado na memória do computador
        // variável: ela tem um tipo(texto, número, lógico...)
        /*
         * EX-1: crie um algoritmo para o JStatitics que leia
         * a opção desejada:
         * "Qual o conjunto de dados utilizado: 1- populacional 2-amostral"
         * o valor recebido deve ser um valor inteiro.
         * O valor deve ser inteiro
         * 
        /*
         
        int opcao; // declarei a variável em java.
        System.out.println("\t # \t# \t JStatistics \t # \t# \t");
        System.out.println("Qual o conjunto de dados utilizado: 1- populacional 2-amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);
    
        //*
         * Ex-2
         * Você deve criar um menu perguntando para o usuário:
         * que tipo de variável ele deseja cadastrar:
         * 1-Quantitativa
         * 2-Qualitativa
         * 
         * o menu deve ter as quebras de linha conforme o texto acima.
         * tudo deve ser feito 
         */
        int opcao;
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o jogo?\n Escolha a estratégia: \n 1- Populacional \n 2-Amostral"));


         String opcaoVariavel= JOptionPane.showInputDialog("Que tipo de variável ele deseja cadastrar:\n 1-Quantitativa \n 2- Qualitativa");
         int opVariavel = Integer.parseInt(opcaoVariavel);
         JOptionPane.showMessageDialog(null, opVariavel);

}
}
