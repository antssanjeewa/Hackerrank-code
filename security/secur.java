
package security;

import java.util.Scanner;

public class secur {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.println(arr[arr[i]]);
        }
        
    }
    
}
