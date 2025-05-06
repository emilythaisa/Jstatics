import javax.swing.JOptionPane;
public class Exercicio.App{
    public static void main(String[] args) throws Exception {
       
    
    /*ajustar os bugs logicos do codigo menu estatistico
     * 
     * crie um loop (do WHILE)
     * Para deixar o menu com opções do suário escolher uma nova opção ou sair
     * O usuário que vai decidir a hora de sair
     */
   
     
     int opc = 0;
        JOptionPane.showMessageDialog(null, "Switch e Loops", "AULA 3", 1);
     
                while(opc != 4){
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção: \n1.Estatistica descritiva \n2.Probabilidade \n3.Modelos Probabilísticos\n4.Sair","Escolha",3));
                 switch (opc) {
                 case 1:
                          JOptionPane.showMessageDialog(null, "Estatísticas Descritivas", "Escolha 1", 1);
                          break;
                 case 2:
                          JOptionPane.showMessageDialog(null, "Probabilidade", "Escolha 2", 1);
                          break;
                 case 3:
                          JOptionPane.showMessageDialog(null, "Modelos Probabilísticos", "Escolha 3", 1);
                          break;
                 case 4:
                          JOptionPane.showMessageDialog(null, "Fim.....", "ACABOU", 0);
                          break;
            
           
                 }
              }
          }
     }
