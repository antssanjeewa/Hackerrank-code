
package javacode;

import java.util.HashMap;
import java.util.Scanner;

public class map {
    public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      HashMap<String,Integer> map = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         map.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(map.containsKey(s)){
             System.out.println(map.get(s));
         }else{
             System.out.println("Not");
         }
         
      }
   }
    
}
