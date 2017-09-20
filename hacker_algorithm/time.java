
package hacker_algorithm;
import java.util.*;
public class time {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int H = s.nextInt();
       int M = s.nextInt();
       String arr[] = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ",
                        "thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
       String arr2[] = {"","","twenty "};
       if(M == 0){
           System.out.println(arr[H]+"o' clock");
       }else if(M == 15){
           System.out.println("quarter past "+arr[H]);
       }else if(M < 20){
           System.out.println(arr[M%20]+"minuts past "+arr[H]);
       }else if(M < 30){
           System.out.println(arr2[M/10]+arr[M%10]+"minuts past "+arr[H]);
       }else if(M == 30){
           System.out.println("half past "+arr[H]);
       }else if(M < 45){
           if(H == 12)
               H =0;
           System.out.println(arr2[(60-M)/10]+arr[(60-M)%20]+"minuts to "+arr[H+1]);
       }else if(M == 45){
           if(H == 12)
               H =0;
           System.out.println("quarter to "+arr[H+1]);
       }else{
           if(H == 12)
               H =0;
           System.out.println(arr[(60-M)%20]+"minuts to "+arr[H+1]);
       }
    }
    
}
