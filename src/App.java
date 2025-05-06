import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
                        //'cara ou coroa- probabilidade'
                        //'a probabilidade de cara ou coroa é 50% cara ou coroa'
                        //'quando ja sabemos se é cara ou coroa é um espaço amostral'
                        //variavel que receba a interação do jogo
                        //Random 
                        //switch
                        //for, do while e while
        String[] espacoAmostral = {"Cara","Coroa"};

                        //objeto Random- realiza o sorteio
        Random random = new Random();

                         //Contadores para verificar a distribuição
        int contCara = 0;
        int contCoroa = 0;
        String mensagem="Espaço amostral: {Cara,Coroa}\n"+
                        "Probabilidade de Cara: 50% \n"+
                        "Probabilidade de Coroa: 50% \n"+
                        "Deseja lançar a moeda?";
                         //loop de lançamento- laço de repetição
        while(true){
                         //interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas",JOptionPane.YES_NO_OPTION);
                if(opcao != JOptionPane.YES_OPTION){ 
                
                         //estatísticas
                String estatisticas = "Jogo finalizado!\n"+
                "Total de Lançamentos: " + (contCara+contCoroa) + "\n"+
                "caras: "+ contCara + "\n"+
                "coroas:" + contCoroa;
                JOptionPane.showMessageDialog(null,estatisticas,"Resultado",JOptionPane.INFORMATION_MESSAGE);

                break;
            }
        
        int resultado = random.nextInt(2);//0-cara 1-coroa
        if(resultado == 0){
            contCara++;
        }else{
            contCoroa++;

        }
        String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+
                       "\n(Índice gerado:"+resultado+")";
        JOptionPane.showMessageDialog(null,saida,"Resultado",JOptionPane.INFORMATION_MESSAGE);   
    }


    }
}
