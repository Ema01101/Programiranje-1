import java.util.*;

public class Zgoscenke{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int velikost = 0;
        int prostor = k;
        int stZgoscenke = 1;

        while(sc.hasNextInt() && stZgoscenke<=n){
            velikost = sc.nextInt();
            if(prostor>=velikost){
                prostor = prostor - velikost;
                System.out.printf("%d EP -> zgoscenka %d (%d EP)%n",velikost, stZgoscenke,(k-prostor));
            }else{
                
                stZgoscenke++;
                if(stZgoscenke<=n){
                    prostor=k;
                    prostor = prostor - velikost;
                    System.out.printf("%d EP -> zgoscenka %d (%d EP)%n",velikost, stZgoscenke,(k-prostor));
                }
                
            }
            
            
        }
    }
}