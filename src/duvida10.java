import javax.swing.JOptionPane;

public class duvida10 {

    public static void main (String[] args){
        //double areaJardim1 = 200;
        //double areaJardim2 = 300;
        //double areaJardim3 = 500;

        double [] areasJardins = {200,300,500};
        System.out.println(areasJardins[0]);
        System.out.println(areasJardins[1]);
        System.out.println(areasJardins[2]);
        double acumuladora = 0;

        for(int i =0;i<areasJardins.length;i++){
        JOptionPane.showMessageDialog(null, areasJardins [i]);
        acumuladora = acumuladora + areasJardins[i];
        }

        JOptionPane.showMessageDialog(null, "quantidade de áreas:"+areasJardins);
        double media = acumuladora/areasJardins.length;
        JOptionPane.showMessageDialog(null, "média"+media);
    }
}
