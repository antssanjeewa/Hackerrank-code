 
package euler;
 
import java.util.Scanner;

public class euler06 {
 
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        while(N>0){
            long number = s.nextLong();
            long sum1 = 0;
            long sum2 = 0;
            for(int i=1;i<=number;i++){
                sum1 += Math.pow(i,2);
            }
            for(int i=1;i<=number;i++){
                sum2 += i;
            }
            System.out.println((int)Math.pow(sum2, 2)-sum1);
            N--;
        }
    }
    
}
