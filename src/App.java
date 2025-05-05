import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");
        // O switch é uma estrutura de seleção múltipla
        // Um if mais organizado (compactado)
        // Escolha
          //Caso
        //Para resolver listas ou constantes.
         //Menu
          //opcao1
          //opcao2
    int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opcão: \n1-Estatística Descritiva \n2-Probabilidade \n3-Modelos probabilisticos \n4-Sair"));
    //!= diferente
    if(op!= 4){
        switch(op){
            case 1:JOptionPane.showMessageDialog(null, "Estatística Descritiva");break;
            case 2:JOptionPane.showMessageDialog(null, "probabilidade");break;
            case 3:JOptionPane.showMessageDialog(null, "Modelos Probabilísticos");break;
    
            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida");break;
    }

    }else{
        JOptionPane.showMessageDialog(null, "Encerrando Sistema");

    }
    //*Como funciona os loops */
    //while- teste no inicio
    //for- while compacto
    //do while- teste no final
    /*
     * inicio=1
     * condição<=5
     * incremento/decremento i=i+1
     */
    int contador = 1;
    while(contador<3){
        JOptionPane.showMessageDialog(null, "VIVA O SENAI!");
        contador = contador+1;

    }
    int i = 1;
    while(i<=5){
        System.out.println(i);
        i++;
    }
    for(int cont=1;cont<=10;cont++){
        System.out.println(cont);
    }
    String sair;
    do{
        //system.out.println("sair:s ou n");
       System.out.println("sair: s ou n");
        sair = JOptionPane.showInputDialog( "Digite s-sim n-não");
    }while(sair.equalsIgnoreCase("não"));{

    }
    
    }
    /*ajustar os bugs logicos do codigo menu estatistico
     * 
     * crie um loo (do WHILE)
     * Para deixar o menu com opções do suário escolher uma nova opção ou sair
     * O usuário que vai decidir a hora de sair
     */
}
