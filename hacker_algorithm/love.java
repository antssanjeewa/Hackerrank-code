 
package hacker_algorithm;
import java.util.*;
public class love {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String letter = s.next();
            int len = letter.length();
            int sum = 0;
            for(int i=0;i<len/2;i++){
                int a = Math.abs(letter.charAt(i) - letter.charAt(len-i-1));
                if(a != 0)
                    sum += a;
            }
            System.out.println(sum);
        }
    }
    
}
