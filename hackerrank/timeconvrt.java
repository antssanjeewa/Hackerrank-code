 
package hackerrank;
 
import java.util.*;

public class timeconvrt {
    //07:05:45PM   19:05:45
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String time = s.next();
        int hour = Integer.parseInt(time.substring(0,2));
        String pm = time.substring(8,10);
        String out = time.substring(2,8);
        if(pm.equals("PM")){
            if(hour != 12){
                hour +=12;
            }
        }else{
           if(hour == 12){
                hour = 00;
            } 
        }
        if(hour ==0){
            System.out.println("00"+out);
        }else{
            System.out.println(hour+out);
        }
        
    }
    
}
