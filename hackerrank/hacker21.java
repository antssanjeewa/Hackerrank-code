 
package hackerrank;
import java.util.*; 
public class hacker21 {
 
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       for(int i=0;i<n;i++){
          int a = s.nextInt();
          int sum =0;
          for(int j=1;j<a;j++){
              
             if(a%j==0){ 
               System.out.print(j+" ");  
                sum+=j;
             }
          
          }
       System.out.println(sum);
       }
    }
    
}
