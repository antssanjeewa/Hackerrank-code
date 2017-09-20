
package maths;

import java.util.Scanner;

public class restur {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int l = s.nextInt();
            int b = s.nextInt();
            int vol = l*b;
            int min = Math.min(l, b);
            int sum  = Integer.MAX_VALUE;
            for(int i=1;i<=min;i++){
                int i2 = i*i;
                if(vol%i2 == 0 && (vol/i2) < sum){
                    sum = vol/i2;
                }
            }
            System.out.println(sum);
        }
    }
}
