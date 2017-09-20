 package IEEE;

import java.util.*;

 public class prob02 {
    public static void main(String args[]){
        try{
        Scanner s = new Scanner(System.in); 
        long c = s.nextLong();
        long h = s.nextLong();
        long o = s.nextLong();
          
        
        if((2*o-h)%4 == 0 &&(2*o - 4*c +h)%4 ==0 && (4*c - 2*o + h)%24==0 ){
        long co2_number = (2*o-h)/4;
        long h2o_number = (2*o - 4*c +h)/4;
        long c6h12o6_number = (4*c - 2*o + h)/24;
        System.out.println(h2o_number+" "+co2_number+" "+c6h12o6_number);
        }else{
        System.out.println("Error");
        }
        }catch(Exception e){
        }
        
         
     
    }
 
}
