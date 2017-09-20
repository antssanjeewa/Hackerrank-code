
package maths;
import java.util.*;
public class point {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int x1 = s.nextInt();
            int x2 = s.nextInt();
            int y1 = s.nextInt();
            int y2 = s.nextInt();
            int diff1 = y1 - x1;
            int diff2 = y2 - x2;
            System.out.println((y1+diff1)+" "+(y2+diff2));
        }
        
    }
    
}
