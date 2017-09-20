import java.util.*;
public class days {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        if((num%4==0 || num%400==0) && num%100 != 0){
            System.out.println("12.09."+num);
        }else{
            System.out.println("13.09."+num);        
        }
    }
    
}
