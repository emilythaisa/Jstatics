import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //criar um jogo de lançar dados similar ao jogo do cara ou coroa.
        //estudar, pesquisar e escolher um dos métodos estatísticos.
        //bonus- -P(A)-calculo simples ou teorema de bayes avançado
        /*coisas que preciso saber:
         *dados tem 6 faces
         * a probabilidade é de 16,67%
         * espaço amostral é 6.
         * 
         */

        
         int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;

        
         Random random = new Random();
 
         
         String[] espacoAmostral = {"1", "2", "3", "4", "5", "6"};
 
         String mensagem = "PENSE EM UM NÚMERO: {1, 2, 3, 4, 5, 6}\n" +
                           "Probabilidade de cair esse número: aproximadamente 16,67%\n" +
                           "Podemos começar?";
 
         while (true) {
             int opcao = JOptionPane.showConfirmDialog(null, mensagem, "DADO VIRTUAL", JOptionPane.YES_NO_OPTION);
 
             if (opcao != JOptionPane.YES_OPTION) {
        
                 int total = cont1 + cont2 + cont3 + cont4 + cont5 + cont6;
                 String estatisticas = "Jogo finalizado!\n" +
                                       "Você lançou: " + total + "\n" +
                                       "Número 1: " + cont1 + "\n" +
                                       "Número 2: " + cont2 + "\n" +
                                       "Número 3: " + cont3 + "\n" +
                                       "Número 4: " + cont4 + "\n" +
                                       "Número 5: " + cont5 + "\n" +
                                       "Número 6: " + cont6;
 
                 JOptionPane.showMessageDialog(null, estatisticas, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                 break;
             }

             int resultado = random.nextInt(6);
             if (resultado == 0) {
                 cont1++;
             } else if (resultado == 1) {
                 cont2++;
             } else if (resultado == 2) {
                 cont3++;
             } else if (resultado == 3) {
                 cont4++;
             } else if (resultado == 4) {
                 cont5++;
             } else if (resultado == 5) {
                 cont6++;
             }
             String saida = "Número gerado: " + espacoAmostral[resultado] +
                            "\n(Índice gerado: " + resultado + ")";
             JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
         }
     }
}