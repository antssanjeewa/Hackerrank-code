
package hackerrank;

import java.util.ArrayList;

public class prob1 {
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(10);
    int a =10;
    String s = "ss";
    s = Integer.toString(a);
    //System.out.print(s);
    // TODO code application logic here
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(2,22);
    System.out.print(arr.size());
    }
    
}
