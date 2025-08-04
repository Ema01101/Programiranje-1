import java.util.*;

public class Fibonacci{
    int a;
    int b;

    public Fibonacci(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int naslednji(){
        int trenutni = this.a;
        int naslednji = this.b;

        this.a = this.b;
        this.b = trenutni + naslednji;

        return trenutni + naslednji;
    }
}