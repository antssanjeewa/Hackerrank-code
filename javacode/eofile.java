 
package javacode;
import java.text.NumberFormat;
import java.util.*;
public class eofile {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int i =1;
//        while((name = s.nextLine()) != null){
//            System.out.println(i+name);
//            i++;
//        }
       //Date d ;
       GregorianCalendar g = new GregorianCalendar(2015,7,05);
       //int day = Integer.parseInt(s.next());
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
       System.out.print(nf.format(11323.238)); 
    }
    
}
