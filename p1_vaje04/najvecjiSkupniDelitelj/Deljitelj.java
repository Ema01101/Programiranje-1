import java.util.*;

public class Deljitelj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();

        for(int i = g; i<=n; i+=g){
            for(int j = g; j<=n; j+=g){
                if(gcd(i,j) == g && i<=j){
                    System.out.printf("(%d, %d)%n", i, j);
                }

            }
        }

    }


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }   


}