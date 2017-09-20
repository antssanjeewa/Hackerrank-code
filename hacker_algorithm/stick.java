 
package hacker_algorithm;
import java.util.*;
public class stick {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<Integer>();
        int n = s.nextInt();
        while(n-->0){
            list.add(s.nextInt());
        }
        while(!list.isEmpty()){
        System.out.println(list.size());
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)< min)
                min = list.get(i);
        }
        for(int i=0;i<list.size();i++){
            //System.out.print(list.get(i)+" - "+min+" = ");
            list.set(i, list.get(i)-min);
            //System.out.println(list.get(i));
            if(list.get(i)==0){
                list.remove(i);
                i--;
            }
        }
        }
    }
    
}
