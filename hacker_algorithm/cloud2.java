
package hacker_algorithm;
import java.util.*;

public class cloud2 {
 
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int k = s.nextInt();
       int arr[] = new int[n];
       for(int i =0;i<n;i++){
           arr[i] = s.nextInt();
       }
       int j=0;
       int sum = 100;
       while(true){
           sum--;
           j += k;
           if(j >= n)
               j -= n;
           if(arr[j] == 1)
               sum -= 2;
           
           if(j == 0)
               break;
           
       System.out.println(sum+" "+j);   
       }
       System.out.println(sum);
    }
    
}
