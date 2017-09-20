
package maths;

import java.util.Scanner;

public class revgame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int m = s.nextInt();
            int l = s.nextInt();
            int arr[] = new int[m];
            for(int i=0;i<m;i++){
                arr[i] = i;
            }
            for(int i=0;i<m;i++){
                int tem[] = arr;
                for(int j=i;j<m;j++){
                   arr[j] = tem[m-i-1];
                }
                
            }
            System.out.println(arr[l-1]);
        }
    }
}
