
package hacker_algorithm;
import java.util.*;
public class matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = m*2;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<n;i++){
            int max = 0;
            int index = 0;
            for(int j=0;j<n;j++){
                if(max < arr[j][i]){
                    max = arr[j][i];
                    index = j;
                }
            }
            if(index >= m){
                for(int j=0;j<m;j++){
                    arr[j][i] = arr[n-j-1][i];
                }
            }
        }
        for(int i=0;i<n;i++){
            int max = 0;
            int index = 0;
            for(int j=0;j<n;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    index = j;
                }
            }
            if(index >= m){
                for(int j=0;j<m;j++){
                    arr[i][j] = arr[i][n-j-1];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                sum += arr[i][j];
                 
            }
        }
        System.out.println(sum);
    }
    
}
