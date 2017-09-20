
package hacker_algorithm;

import java.util.Scanner;

public class bon {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            int k = s.nextInt();
            if(i != r)
                sum +=k;
        }
        r = s.nextInt() - (sum/2);
        if(r ==0){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(r);
        }
        
    }
    
}
