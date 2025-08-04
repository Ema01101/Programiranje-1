import java.util.*;

public class Zaporedje{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int stevec = 0;
        int najStevec = 0;
        int najStevilo = a;

        for(int i = a; i<=b; i++){
            stevec = collatz(i);
            if(stevec > najStevec){
                najStevec = stevec;
                najStevilo = i;
            }
        }
        System.out.println(najStevilo);
        System.out.println(najStevec);

    }

    public static int collatz(int stevilo){
        int stevec = 1;
        //System.out.printf("------- %d -------%n", stevilo);
        while(stevilo !=1){
            if(stevilo%2 == 0){
            stevilo = stevilo/2;
            stevec++;
            //System.out.println(stevilo);
        }else{
            stevilo = (stevilo *3) +1;
            stevec++;
            //System.out.println(stevilo);
        }
        }
        
        return stevec;
    }

    


}