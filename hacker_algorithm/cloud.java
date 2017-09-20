
package hacker_algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cloud {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump =0;
        int i=0;
        while(i<n-1){
            System.out.print(i+" ");
            if(i+2<n-1 && c[i+2] == 0){
                System.out.println("2 ");
                jump++;
                if(i+2 < n){
                    i +=2;
                }else{
                    i++;
                }
                    
            }else if(c[i+1] == 0){
                System.out.println("1 ");
                jump++;
                i++;
            }else{
                System.out.println("0 ");
                break;
            }
            
        }
        System.out.println(jump);
    }
}

