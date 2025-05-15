import javax.swing.JOptionPane;

public class duvida6 {
    public static final int FIDELIDADE = 10; // CONSTANTE X VARIAVEL 
    public static final double DESCONTO = 0.10;
    public static void main (String [] args ){ 

      
      

      JOptionPane.showMessageDialog( null, "Iniciando: \n 1- Poda (150,00) \n 2-cortar grama (250,00)");
      int contador = 0;
      double acumulador =0;
      int opcao;

    do {
       opcao = Integer.parseInt(JOptionPane.showInputDialog (null,"Iniciando:\n 1- Poda (150,00)\n 2-cortar grama (250,00) \n 3-sair" ));
       if(opcao==1){
        acumulador=acumulador+150;
        contador =  contador +1;
       }else if(opcao==2){
        acumulador=acumulador+250;
        contador = contador+2;
       }

    }while(opcao!=3);
    JOptionPane.showMessageDialog(null, "total da compra:"+acumulador);
    if(contador>=FIDELIDADE){
        Double valorComDesconto = acumulador - (acumulador*DESCONTO);
        JOptionPane.showMessageDialog(null, "valor com Desconto"+ valorComDesconto);
    }



    }
}


