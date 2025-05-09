import javax.swing.JOptionPane;
//parte 1
public class AloJardim {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Alô, Jardim!");
      
        //parte 2
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");

        JOptionPane.showMessageDialog(null, "Cadastro realizado!\n" + "Nome: " + nome + "\n" + "Endereço: " + endereco);

        //parte 3

        String areajardin = JOptionPane.showInputDialog(null,
            "Pergunta de segurança, \nSe a área do seu jardim é 50m2 x 60m2,\nQual é a sua área total?");
        
        double media = Double.parseDouble(areajardin);

        if (media == 3000) {
            JOptionPane.showMessageDialog(null, "Acertou!\nvamos para a próxima fase.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Errada!",
                "Finalizando", JOptionPane.ERROR_MESSAGE);
        }






    }
}