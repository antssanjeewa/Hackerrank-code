package IEEE;

import java.io.*;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class prob05 {
    public static void main(String args[]){
        try {
        //Scanner s = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        //String line = s.next();
        int T = Integer.valueOf(reader.readLine());
        //System.out.println(T);
        for(int i=0;i<T;i++){
            String line1[] = reader.readLine().split(" ");
            int arr[] = new int[3];
            for(int k=0;k<3;k++){
                arr[k] = Integer.parseInt(line1[k]);
            }
            int id =  arr[0]; 
            int a =  arr[1] ;
            int b = arr[2] ;
            //int c =  arr[3] ;
            if(id ==1){
                //int a = Integer.parseInt(line1[1]);
                //int b = Integer.parseInt(line1[2]);
                int c = Integer.parseInt(line1[3]);
                int d = c +(b-a);
                String get = line.substring(a-1,b);
                String set = line.substring(c-1,d);
                String newline = line.replaceFirst(get,set);
                if(line.endsWith(newline)){
                    System.out.println("Y");
                }else{
                    System.out.println("N");
                }
                //System.out.println("1 "+newline);
            }else if(id ==2){
                ///int a = Integer.parseInt(line1[1]);
               // int b = Integer.parseInt(line1[2]);
                int c = Integer.parseInt(line1[3]);
                int d = c +(b-a);
                String get = line.substring(a-1,b);
                String set = line.substring(c-1,d);
                line = line.replaceFirst(get,set);
                //System.out.println("2 "+line);
            }else if(id ==3){
                //int a = Integer.parseInt(line1[1]);
               // int b = Integer.parseInt(line1[2]);
                
                char newchar[] = new char[line.length()];
                for(int j=a-1;j<b;j++){
                    char q = line.charAt(j);
                    q++;
                    newchar = line.toCharArray();
                    newchar[j] = q;
                     
                }
                
            }
         }   
        } catch (Exception ex) {
            System.out.println(ex);
            //Logger.getLogger(prob05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
