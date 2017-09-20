 package IEEE;
 
import java.util.*;

public class prob06 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in); 
        int testcase = s.nextInt();
        for(int i=0;i<testcase;i++){
            int number = s.nextInt();
            String name = s.next();
            int length = name.length();
            if(length%2 ==1){
                int middle = (length/2);
                int count =0;
                for(int j=0;j<middle;j++){
                    System.out.println(name.charAt(j)+" "+name.charAt(length-j-1));
                    if(name.charAt(j) == name.charAt(length-j-1)){
                        count++;
                    }
                }
                if(number%2==0){
                    int get = length-count-number-1;
                }else{
                    int get = length-count-number;
                }
            }
            
        
        
        }
    
    
    
    }
}
