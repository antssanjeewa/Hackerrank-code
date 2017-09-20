/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker_algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int value = s.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<word.length()-2;i++){
            list.add(word.substring(i,i+3));
            //System.out.println(word.substring(i,i+3));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        
    }
}
