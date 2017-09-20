
package hacker_algorithm;
import java.util.*;

public class angry {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
        int number = s.nextInt();
        int want = s.nextInt();
        int count =0; 
        for(int i = 0;i<number;i++){
            if(s.nextInt() < 1)
                count++;
        }
        if(count >= want){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        } 
        }
    }
    
}
