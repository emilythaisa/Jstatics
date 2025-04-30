import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //if
        //if else
        //switch
        //ternário (?) (:)
        int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população?" + " \n 1- parâmetro \n 2- Estatística"));
        if (op == 1){
           JOptionPane.showMessageDialog(null, "Certa Resposta");
        }else{ 
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics", JOptionPane.ERROR_MESSAGE);

        }
        //if else
        //Exercícios
        /*Considerando os números 30,50,80,90 Digite o valor da média artmética simples*/
        //gabarito: 62,5
        /*Considerando os valores 10,40,50,80,10. Digite qual é a moda? */
        //10
        /* Qual a medida de tendência central que mostra o centro da amostra? */
        //mediana

        //String nome;
        //if nome.equals("mediana")

        //double resposta (toda vez que o numero for quebrado)= Double.parseDouble()
    


//exercicio 1:


Double media = Double.parseDouble(JOptionPane.showInputDialog(null,"Considerando os números 30,50,80,90 \n Digite o valor da média artmética simples"));
    if (media == 62.5){
       JOptionPane.showMessageDialog(null, "Certa Resposta");
    }else{ 
        JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics", JOptionPane.ERROR_MESSAGE);

    }

//exercicio 2:
int moda = Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10. \n Digite qual é a moda?"));
        if (moda == 10){
           JOptionPane.showMessageDialog(null, "Certa Resposta");
        }else{ 
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics", JOptionPane.ERROR_MESSAGE);
 }

 //exercicio 3:
    String nome = JOptionPane.showInputDialog(null,"Qual a medida de tendência central que mostra o centro da amostra?");
    if(nome.equalsIgnoreCase("mediana")){
        JOptionPane.showMessageDialog(null, "Certa Resposta");
    }else{ 
        JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics", JOptionPane.ERROR_MESSAGE);  
    }


 }


 }