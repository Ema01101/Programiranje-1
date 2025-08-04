import java.util.*;

public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int stGlasov = 0;

        for(int i = 0; i < (t[leto][stranka].length); i++){
            
            stGlasov = stGlasov + t[leto][stranka][i];
        }

        return stGlasov;
    }

    public static int[][] glasovi(int[][][] t) {
        
        int[][] tabela = new int[t.length][t[0].length];

        

        for(int i = 0; i<t.length; i++){
            for(int j = 0; j<t[i].length;j++){
                tabela[i][j] = steviloGlasov(t, i, j);
            }
        }
        // popravite / dopolnite
        return tabela;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int indeksVolisca = -1;
        int maxGlasov=-1;

        int[] tabela = new int[t[0][0].length];


        for(int i = 0; i< tabela.length; i++){
            for(int j = 0; j<t.length; j++){
                tabela[i] = tabela[i] + t[j][stranka][i];
            }
        }

        for(int i = 0; i< tabela.length; i++){
            if(tabela[i] > maxGlasov){
                maxGlasov = tabela[i];
                indeksVolisca = i;
            }
        }

        return indeksVolisca;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int tabela[] = new int[t[0].length];
        int stevec = 1;
        int vsota = 0;

        for(int i=0; i<t.length;i++){
            stevec = 1;
            for(int j = 0; j<tabela.length; j++){
                tabela[j] = t[i][j][volisce];
            }

            for(int k = 0; k<tabela.length; k++){
                if(tabela[k]>tabela[stranka]){
                    stevec++;
                   
                }
            }
            /*System.out.println(Arrays.toString(tabela));
            System.out.println("V letu " + i + " se je uvrstila: " + stevec );*/
            vsota = vsota + (stevec);
             
        }

        /*for(int i = 0; i<tabela.length; i++){
            if(tabela[i]>tabela[stranka]){
                stevec++;
            }
        }*/


        return vsota;
    }
}
