 
package hackerrank;

import java.util.Scanner;

 
public class Circlearray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in); 
        int N = s.nextInt();
        int K = s.nextInt();
        int Q = s.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextInt();
        }
        for(int j=0;j<K;j++){
            int temp = arr[N-1];
            for(int i=N-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        
        
        for(int i=0;i<Q;i++){
            int temp = s.nextInt();
            System.out.println(arr[temp]);
        }
    }
}
