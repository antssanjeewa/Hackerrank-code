
package euler;

import java.util.Scanner;

public class euler15 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       while(n-->0){
           int a = s.nextInt();
           int b = s.nextInt();
           int sum = run(a,b);
           System.out.println(sum);
       }
    }
    public static int run(int a,int b){
        if(a==1 && b ==1){
            return 2;
        }else if(a==1){
            return run(a,b-1)+1;
           
        }else if(b==1){
            return run(a-1,b)+1;
            
        }else{
           return run(a-1,b) + run(a,b-1);
             
        }
        
    }
}
