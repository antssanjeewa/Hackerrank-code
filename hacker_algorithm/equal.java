 
package hacker_algorithm;
 
import java.util.Scanner;

public class equal {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        } 
        int max = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count>max)
                max = count;
        }
        System.out.println(n-max);
    }
    
}
