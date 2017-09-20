 
package hackerrank;
 import java.util.*;
public class hacker22 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList al = new ArrayList();
        for(int i=0;i<n;i++){
            al.add(i,s.next());
            Collections.sort(al);
        System.out.println(al.get(i));
        }
    }
    
}
