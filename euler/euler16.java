
package euler;

import java.util.Scanner;

public class euler16 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       while(n-->0){
           double m = s.nextInt();
           String word = Integer.toString((int)Math.pow(2,m));
           int len = word.length();
           int sum =0;
           for(int i=0;i<len;i++){
               sum += (int)word.charAt(i)-48;
           }
           System.out.println(sum);
       }
    }
    
}
