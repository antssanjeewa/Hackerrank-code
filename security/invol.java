
package security;

import java.util.Scanner;

public class invol {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = s.nextInt();
        }
        int count =0;
        for(int i=1;i<=n;i++){
            if(i == arr[arr[i]])
                count++;
        }
        if(count == n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
