
package euler;

import java.util.*;

public class euler22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        while(n-->0){
            list.add(s.next());
        }
        Collections.sort(list);
        int n2 = s.nextInt();
        while(n2-->0){
            String name = s.next();
            int index = list.indexOf(name)+1;
            int len = name.length();
            int sum =0;
            for(int i=0;i<len;i++){
                sum += name.charAt(i)-64;
                
            }
            System.out.println(sum*index);
        }
    }
    
}
