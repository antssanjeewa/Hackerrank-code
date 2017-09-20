 package hacker_algorithm;
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        for(int i=0;i<list.size();i++){
            String tem = s.replaceAll(list.get(i).toString(),"");
            for(int j=0;j<list.size();j++){
                if(list.get(i) != list.get(j) && !list2.contains(tem.replaceAll(list.get(j).toString(),""))){
                    list2.add(tem.replaceAll(list.get(j).toString(),""));
                     System.out.println(list.get(i).toString()+" "+ list.get(j).toString());
                }
               
            }
        }
        System.out.println(list2);
        int i = 0;
        while(i<list2.size()){
//            System.out.println(list2.size()+" lj");
//            System.out.println(list2.get(i)+" "+i);
//            System.out.println(list2.get(i).length());        
            for(int j=0;j<list2.get(i).length()-1;j++){
                //System.out.println(list2.get(i).charAt(j)+" "+list2.get(i).charAt(j+1));
                if(list2.get(i).charAt(j) == list2.get(i).charAt(j+1)){
                    //System.out.println(list2.get(i));
                    list2.remove(i);
                    i--;
                    break;
                }else{
                
                }
            }
            i++;
        }
        int value = 0;
        for(i =0;i<list2.size();i++){
            if(value < list2.get(i).length()){
                value = list2.get(i).length();
            }
        }
        System.out.println(value);
        
    }
}
