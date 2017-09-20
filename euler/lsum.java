 
package euler;
 
import java.math.BigInteger;
import java.util.Scanner;

public class lsum {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger x1 = new BigInteger(String.valueOf(0));
        int n = s.nextInt();
        while(n-->0){
            x1 = x1.add(new BigInteger(s.next()));
        }
        String m = x1.toString();
        System.out.println(m.substring(0,11));
    }
    
}
