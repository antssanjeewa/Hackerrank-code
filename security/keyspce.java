
package security;

import java.util.Scanner;

public class keyspce {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int e = s.nextInt();
        int len = word.length();
        String out = "";
        if(e > 0){
            for(int i=0;i<len;i++){
                int ch = word.charAt(i);
                if(ch < 58 && ch > 47){
                    ch = ch + (e%10);
                    if(ch > 57)
                        ch -= 10;
                }else if(ch < 91 && ch > 64){
                    ch = ch + (e%26);
                    if(ch > 90)
                        ch -= 26;
                }else if(ch < 123 && ch > 96){
                    ch = ch + (e%26);
                    if(ch > 122)
                        ch -= 26;
                }
                out = out.concat(Character.toString((char)ch));
               
            }
        }else{
           for(int i=0;i<len;i++){
                int ch = word.charAt(i);
                if(ch < 58 && ch > 47){
                    ch = ch + (e%10);
                    if(ch < 48)
                        ch += 10;
                }else if(ch < 91 && ch > 64){
                    ch = ch + (e%26);
                    if(ch < 65)
                        ch += 26;
                }else if(ch < 123 && ch > 96){
                    ch = ch + (e%26);
                    if(ch < 97)
                        ch += 26;
                }
                out = out.concat(Character.toString((char)ch));
               
            } 
        }
        
        System.out.println(out);
        
    }
    
}
