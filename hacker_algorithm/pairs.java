
package hacker_algorithm;
import java.util.*;
public class pairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int diff = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(Math.abs(arr[i]-arr[j]) == diff){
                   count++;
               }
           }
        }
        System.out.println(count);
    }
    
}
