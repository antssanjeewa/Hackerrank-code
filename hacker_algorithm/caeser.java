
package hacker_algorithm;

import java.util.Scanner;

public class caeser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String list = s.next();
        int jump = s.nextInt();
        
        for(int i=0;i<n;i++){
            int tem = (int)list.charAt(i);
            if(tem < 123 && tem > 96){
                tem += jump;
                if(tem > 122)
                    tem -= 26;
            }
            if(tem < 91 && tem > 64){
                tem += jump;
                if(tem > 122)
                    tem -= 26;
            }
            System.out.print((char)(tem));
        }
    }
    
}
