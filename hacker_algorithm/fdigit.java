
package hacker_algorithm;

import java.util.Scanner;

public class fdigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String x = s.next(); 
            int len = x.length();
            int number = Integer.parseInt(x);
            int count = 0;
            for(int i=0;i<len;i++){
                if(((int)x.charAt(i)-48)!=0 && number%((int)x.charAt(i)-48) == 0){
                    count++;
                
                }
            }
            
        System.out.println(count);
        }
    }
    
}
