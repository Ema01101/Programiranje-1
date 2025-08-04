import java.util.*;

public class Stevke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        while(a > 0){
            long stevka = a % 10;
            a = (a/10);
            System.out.println(stevka);
        }
    }

}