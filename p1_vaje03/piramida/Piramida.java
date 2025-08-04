import java.util.*;

public class Piramida{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int presledki = (n-1);
        int zvezdice = 1;

        for(int i = 0; i<n; i++){
            for(int j = presledki; j>0; j--){
                System.out.print(" ");
            }
            
            presledki = presledki -1;
            for(int k = zvezdice; k>0; k-- ){
                System.out.print("*");
            }
            zvezdice = zvezdice +2;
            System.out.println("");

        }
    }

}