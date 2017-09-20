 
package hacker_algorithm;
 
import java.util.Scanner;

public class repet {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String w = s.nextLine();
        int m = s.nextInt();
        int len = w.length();
        int number = m/len;
        int max =0;
        char c = w.charAt(0);
        for(int i=0;i<len;i++){
            int count =0;
            for(int j=0;j<len;j++){
                if(w.charAt(i)== w.charAt(j)){
                    count++;
                }
            }
            if(max < count){
                max = count;
                c = w.charAt(i);
            }
        }
        max = max*number;
        int rem = m%len;
        for(int i=0;i<rem;i++){
            if(c == w.charAt(i))
                max++;
        }
        System.out.println(max);
    }
    
}
