 
package hackerrank;
 
import java.util.Scanner;

public class Hacker20 {
 
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         for(int i=0;i<n;i++){
            int t = s.nextInt();
            int a =1;
         for(int j=1;j<=t;j++){
             a*=j;
         }
         
        String b = Integer.toString(a);
         
        int cc =0;
        
        for(int j=0;j<b.length();j++){
          
            cc += Integer.parseInt(b.substring(j,j+1));
           
        } 
          System.out.println(cc);
         }
    }
    
}
