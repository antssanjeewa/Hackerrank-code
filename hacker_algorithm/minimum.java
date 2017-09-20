
package hacker_algorithm;

import java.util.Scanner;

public class minimum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val = Math.abs(i-j);
                if(arr[i] == arr[j] && val<min)
                    min = val;
            }
        }
        System.out.println(min);
    }
    
}
