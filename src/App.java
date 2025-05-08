import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjunto de objetos
        //Nosso objetivo nesse codigo é entender a diferença entre método com o tipo VOID e com o tipo 
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null, "Nome Científico:"+"\n"+m1.getNomeCientifico());
        

        //Exercícios
        /*
         * Considerando a utilização de métodos set e get e considerando a aula de hoje:
         * anatomia de função/procedimento
         * set - void (procedimento)
         * get- String (função)
         * Java sempre é método (para ele)
         * void
         * String, int, boolean
         *                DESAFIO:
         * Crie mais dois objetos para armazenar e mostrar os dados do: canguru e peixe boi
         */
        
         //canguru
        Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("MACROPUS");
        JOptionPane.showMessageDialog(null, "Nome Científico:"+"\n" +m2.getNomeCientifico());
        //peixe boi
        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "Nome Científico:" +"\n" +m3.getNomeCientifico());

    }
}
