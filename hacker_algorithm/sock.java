 
package hacker_algorithm;
 
import java.util.*;
public class sock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = s.nextInt();
        while(n-->0){
            list.add(s.nextInt());
        }
        int sum =0;
        for(int i=0;i<list.size();i++){
            int count =0;
            for(int j=0;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    if(j< i)
                        break;
                    count++;
                }
            }
            sum += count/2;
           
        }
        System.out.println(sum);
    }
    
}
