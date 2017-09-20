package others;

import java.util.*;

public class marcs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        Collections.sort(list);
        int miles = 0;
        for(int i=0;i<n;i++){
            miles = miles + (list.get(n-i-1)*(int)Math.pow(2, i));
            System.out.println(miles);
        }
        
    }
    
}
