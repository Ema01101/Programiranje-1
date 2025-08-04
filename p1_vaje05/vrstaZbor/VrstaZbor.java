import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class VrstaZbor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean noben = true;
        int a = sc.nextInt();
        int[] tabela = new int[a];
        for(int i =0; i<a; i++ ){
            tabela[i] = sc.nextInt();
        }

        for(int i=0;i<a;i++){
            if(i==0){
                if(tabela[i]<= tabela[i+1]){
                    System.out.println(i);
                    noben = false;
                }
            }else if(i==(a-1)){
                if(tabela[i] >= tabela[i-1]){
                    System.out.println(i);
                    noben = false;
                }
            }else{
                if(tabela[i-1] <= tabela[i] && tabela[i] <= tabela[i+1]){
                    System.out.println(i);
                    noben = false;
                }
            }
            

        }
        if(noben == true){
            System.out.println("NOBEDEN");
        }
    }
}