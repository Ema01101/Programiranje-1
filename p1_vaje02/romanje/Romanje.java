import java.util.*;

public class Romanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();
        int stDneva = 1;

        while((d-p)>0 && p>0){
            System.out.println(stDneva + ": " + d + " -> " + (d-p));
            d = d-p;
            p = p-z;
            stDneva = stDneva +1;
            

        }
        if(p>=d){
            System.out.println(stDneva + ": " + d + " -> 0");
        }
        
    }

}
