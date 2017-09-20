/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker_algorithm;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;  
public class RegexMatches { 
    public static void main(String args[]){  
    // String to be scanned to find the pattern.
    String line ="This order was places for QT3000! OK?"; 
    String pattern ="(h.)(.r.)";  
    // Create a Pattern object  
    Pattern r =Pattern.compile(pattern);  
    // Now create matcher object. 
    Matcher m = r.matcher(line); 
    if(m.find()){      
        System.out.println("Found value: "+ m.group(0));
        System.out.println("Found value: "+ m.group(1)); 
        System.out.println("Found value: "+ m.group(2));  
    }else{       System.out.println("NO MATCH");  
    }  
    }
}
