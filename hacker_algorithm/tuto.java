
package hacker_algorithm;

import java.util.Scanner;

public class tuto {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int val = s.nextInt();
       int len = s.nextInt();
       int index = 0;
       int arr[] = new int[len]; 
       for(int i=0;i<len;i++){
           arr[i] = s.nextInt();
           if(arr[i]==val)
               index = i;
       }
       System.out.println(index);
    }
    
}
