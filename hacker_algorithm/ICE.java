 
package hacker_algorithm;
 
import java.util.Scanner;

public class ICE {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int price = s.nextInt();
            int number = s.nextInt();
            int arr[] = new int[number];
            for(int i=0;i<number;i++){
                arr[i] = s.nextInt();
            }
            for(int i=0;i<number-1;i++){
                for(int j=i+1;j<number;j++){
                    if((arr[i]+arr[j]) == price){
                        System.out.println(i+" "+j);
                        break;
                    }
                }
            }
            
        }
        
        
    }
    
}
