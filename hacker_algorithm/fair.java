
package hacker_algorithm;

import java.util.Scanner;

public class fair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int sum =0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum += B[B_i];
        }
        if(sum % 2==1){
            System.out.println("NO");
        }else{
            
        }
    }
    
}
