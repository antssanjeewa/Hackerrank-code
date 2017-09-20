 
package hacker_algorithm;
import java.math.BigInteger;
import java.util.*;
public class fibonanci {
 
//    public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         BigInteger x1, x2, x3;
//
//        x1 = new BigInteger(String.valueOf(s.nextLong()));
//        x2 = new BigInteger(String.valueOf(s.nextLong()));
//         int n = s.nextInt();
//         while(n>2){
//            x3 = x2;
//            x2 = x1.add(x2.multiply(x2));
//            x1 = x3;
//            n--;
//        }
//        if(n == 0){
//            System.out.println(x1);
//        }else{
//            System.out.println(x2);
//        }
//        
//    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       int n = s.nextInt();
       BigInteger x2; 
       BigInteger x1 = new BigInteger(String.valueOf(1));
       while(n>0){
           x2 = new BigInteger(String.valueOf(n));
           System.out.print(x2+" ");
           x1 =  x1.multiply(x2);
           n--;
       }
       System.out.println(x1);
    }
    
}

 