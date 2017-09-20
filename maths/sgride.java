
package maths;

import java.util.Scanner;

public class sgride {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int number =0;
        if(n%2 == 0){
            number = 5*(n-2);
            number = number + (2*m-1);
        }else{
            number = 5*(n-1);
            number = number + (2*(m-1));
        }
        System.out.println(number);
    }
}
