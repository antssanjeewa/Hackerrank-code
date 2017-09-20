  
package maths;
 
import java.util.*;

public class arr2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int m = s.nextInt();
            int val = s.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int i =0;i<m;i++){
                list1.add(s.nextInt());
            }
            for(int i =0;i<m;i++){
                list2.add(s.nextInt());
            }
            Collections.sort(list1);
            Collections.sort(list2);
            int count =0;
            for(int i =0;i<m;i++){
                if(list1.get(i)+list2.get(m-1-i) >= val)
                    count++;
            }
            if(count == m){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
