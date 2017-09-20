
package javacode;

import java.util.Scanner;

public class tag {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n-->0){
            String word = s.nextLine();
            int f = word.indexOf(' ');
            int beg1 = word.lastIndexOf('>', f);
            int beg2 = word.lastIndexOf('<', f);
            String tag = "</"+word.substring(beg2+1, beg1+1);
            int end = word.indexOf(tag);
            String last = word.substring(beg1+1, end);
            if(end > 0){
                System.out.println(last);
            }else{
                System.out.println("None");
            }
            
            
            int f2 = word.indexOf(' ',end);
            if(f2>0){
                int beg3 = word.lastIndexOf('>', f2);
                int beg4 = word.lastIndexOf('<', f2);    
                String tag2 = "</"+word.substring(beg4+1, beg3+1);
                int end2 = word.indexOf(tag2);
                String last2 = word.substring(beg3+1, end2);
                System.out.println(last2);
            
            }
        }
    }
    
}
