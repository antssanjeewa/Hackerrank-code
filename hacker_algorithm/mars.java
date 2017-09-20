 
package hacker_algorithm;
 
import java.util.Scanner;

public class mars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for(int i=0;i<S.length();i+=3){
            System.out.println(S.charAt(i)+" "+(S.charAt(i) != 'S'));
            if(S.charAt(i) != 'S'){
                count++;
            }
            if(S.charAt(i+1) != 'O'){
                count++;
            }
            if(S.charAt(i+2) != 'S'){
                count++;
            }
        }
        System.out.println(count);
    }
}
