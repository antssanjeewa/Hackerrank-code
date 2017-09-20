
package euler;

import java.util.Scanner;

public class euler17 {
    static String arr[] = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ",
                        "thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
    static String arr2[] = {"","","twenty ","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
       while(n-->0){
           String num = "";
            long number = s.nextLong();
            if(number > 1000000000){
                long tem = number/1000000000;
                num = word(num,(int)tem)+"billion "; 
                number = number%1000000000;
            }
            if(number > 1000000){
                long tem = number/1000000;
                num = word(num,(int)tem)+"million "; 
                number = number%1000000;
            }
            if(number > 1000){
                long tem = number/1000;
                num = word(num,(int)tem)+"Thousand "; 
                number = number%1000;
            }
        num = word(num,(int)number);    
        System.out.println(num);   
        }
    }
    public static String word(String num,int number){
        if(number > 100){
                 num += arr[number/100]+"Hundred ";
                 number = number%100;
            }
            if(number < 20){
                 num += arr[number];
            }else if(number < 100){
                 num += arr2[number/10]+" "+arr[number%10];
            }
        return num;
    }
}
