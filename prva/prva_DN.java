import java.util.*;

public class prva_DN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int vsota = 0;

        while(a>1 && b>1){

            a = a-1;
            b = b-1;

            vsota = vsota + (a*b);
            

        }
            
        System.out.print(vsota);

    }

}
