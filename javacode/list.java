
package javacode;

import java.util.*;

public class list {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       List list = new ArrayList();
       while(n-->0){
          list.add(s.nextInt());
       }
       int m = s.nextInt();
       while(m-->0){
           String c = s.next();
       if(c.equals("insert")){
           int a = s.nextInt();
           int b = s.nextInt();
           list.add(a,b);
       }else if(c.equals("delete")){
           list.remove(s.nextInt());
       } 
       }
       for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }
      
    }
    
}
