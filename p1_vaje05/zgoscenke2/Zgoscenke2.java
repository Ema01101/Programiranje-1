import java.util.*;

public class Zgoscenke2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int najmanjZasedena = 0;
        int trenutna = 0;
        int najmanjsaZasedenost = k;

        int[] tabela = new int[n];

        while(sc.hasNextInt()){
            int velikost = sc.nextInt();
            
            for(int i = 0; i<n; i++){
                if(tabela[i]<najmanjsaZasedenost){
                    //System.out.printf("tabela[%d](=%d) < najmenjsaZasedenost(=%d)%n", i,tabela[i], najmanjsaZasedenost);
                    
                    najmanjZasedena = i;
                    najmanjsaZasedenost = tabela[i];
                }
                
            }

            if(tabela[najmanjZasedena] + velikost <= k){
                
                tabela[najmanjZasedena] = tabela[najmanjZasedena] + velikost;
                najmanjsaZasedenost=k;
                System.out.printf("%d EP -> zgoscenka %d %s%n", velikost, najmanjZasedena+1, Arrays.toString(tabela));
                    
            }else{
                break;
            }
        }

    }
}