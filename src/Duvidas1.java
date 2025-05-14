import javax.swing.JOptionPane;

public class Duvidas1 {
    public static void main (String args []){

    String msg = "JGarden";
    int idAgendamento = 2147483647;
    byte numFerramentas = 127;
    short agendamentosMes = 32767;
    long dataAgendamento= System.currentTimeMillis();
    float precoServico = 99.90f;
    double areaJardim= 120.75;
    char  tipoServico = 'C';
    boolean concluido = true;
    String cliente = "Emily Thaisa";
    String servico = "Poda";


    JOptionPane.showMessageDialog(null, msg);
    JOptionPane.showMessageDialog(null, "ID Agendamento:"+ idAgendamento);
    JOptionPane.showMessageDialog(null, "Numero de ferramentas: " +numFerramentas);
    JOptionPane.showMessageDialog(null, "Quantidade de agendamentos \n mês"+agendamentosMes);
    JOptionPane.showMessageDialog(null, "Data atual em milissegundos" + dataAgendamento);
    JOptionPane.showMessageDialog(null, "Preço do serviço"+ precoServico);
    JOptionPane.showMessageDialog(null, "Área do jardim:"+ areaJardim);
    JOptionPane.showMessageDialog(null, "Tipo de Serviço" + (tipoServico=='P'? "Poda":"Corte grama"));
    if (concluido){
        JOptionPane.showMessageDialog(null, "Faz o pix AGORA\n" + cliente + "Você sabia que seu nome tem\n" + cliente.length()+"\nletras?");
    }else{
        JOptionPane.showMessageDialog(null, "Serviço em andamento (aguarde por favor)");
    }
    JOptionPane.showMessageDialog(null, servico.charAt(0));




    }
    
}
