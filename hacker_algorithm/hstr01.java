package hacker_algorithm;
 
import java.util.*;
 

public class hstr01 {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char word[] = s.next().toCharArray();
        String name = "";
        for(int i=0;i<word.length-1;i++){
            if(word[i] == word[i+1] || word[i]+1 == word[i+1]){
                name += word[i];
                i++;
                i++;
            } 
            if(name.length()>1){
                System.out.println(name);
            }else{
                System.out.println("Empty String");
            }
        }
        
         
 
 }

}
