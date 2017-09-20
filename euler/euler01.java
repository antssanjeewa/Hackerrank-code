 
package euler;

import java.util.*;
public class euler01 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        while(N>0){
            long number = s.nextLong();
            long sum = 0;
            number--;
            while(number>0){
                if(number%3==0 || number%5==0){
                    sum += number;
                }
                number--;
            }
            System.out.println(sum);
            N--;
        }
    }
}
