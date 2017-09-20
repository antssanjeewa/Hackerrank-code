
package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class missing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        System.out.println(list);
        int m = s.nextInt();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            int num = s.nextInt();
            if(!list.contains(num)){
                list2.add(num);
            }else{
                list.remove(list.indexOf(num));
                
            }
            
        }
        Collections.sort(list2);
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i));
        }
    }
    
}
