
package hacker_algorithm;

import java.util.*;

public class game {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String c = s.next();
        int len = c.length();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0;i<len;i++){
            if(!list.contains(c.charAt(i)))
                list.add(c.charAt(i));
        }
        int lenc = list.size();
        int sum = 0;
        for(int i=0;i<lenc;i++){
            int count = 0;
            for(int j = 0;j<len;j++){
                if(list.get(i) == c.charAt(j)){
                    count++;
                }
            }
           sum += count%2;
        }
        if(len%2 == sum){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
    }
    
}
