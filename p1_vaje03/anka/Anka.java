import java.util.*;

public class Anka{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int stevec = 0;

        for(int i = 1; i<=9; i=i+2){
            for(int j=(m+1); j<=9; j++){
                for(int k = 0; k<10; k++){
                    if(k%d == 0){
                        System.out.printf("%d-%d-%d%n",i,j,k);
                        stevec++;
                    }

                }
            }

        }
        System.out.println(stevec);
    }
}