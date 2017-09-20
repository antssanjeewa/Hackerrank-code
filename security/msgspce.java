
package security;

import java.util.Scanner;

public class msgspce {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int len = word.length();
        String out = "";
        for(int i=0;i<len;i++){
            String tem = Character.toString((char)(word.charAt(i)+1));
            if(tem.equals(":"))
                tem = "0";
            else if(tem.equals("["))
                tem = "A";
            else if(tem.equals("{"))
                tem = "a";
            out = out.concat(tem);
        }
        System.out.println(out);
    }
    
}
