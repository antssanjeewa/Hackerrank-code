package hacker_algorithm;
import java.util.*;
public class gemstore {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Set<Character> list = new HashSet<Character>();
        Set<Character> list2 = new HashSet<Character>();
        for(int i=0;i<num;i++){
            int count =0;
            String word = s.next();
            for(int j=0;j<word.length();j++){
                if(i==0){
                    list2.add(word.charAt(j));
                    System.out.println("bb "+word.charAt(j));
                }else if(i==1 && !list2.add(word.charAt(j))){
                    list.add(word.charAt(j));
                    System.out.println("aa "+word.charAt(j));
                }else if(list.add(word.charAt(j))){
                    count++;
                    System.out.println("cc "+word.charAt(j));
                }
            }
            System.out.println(count);
        }
            

    }
}
        
    
