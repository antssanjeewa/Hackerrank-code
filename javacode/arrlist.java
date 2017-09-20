package javacode;
import java.util.*;
/**
 *
 * @author ANTS
 */
public class arrlist {

    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            ArrayList [] as = new ArrayList[N];
            for(int i=0;i<N;i++){
               ArrayList<Integer> intlist = new ArrayList<Integer>(); 
               int k = s.nextInt();
               while(k-->0){
                   intlist.add(s.nextInt());
               }
               as [i] = intlist;
            }
        
            N = s.nextInt();
            for(int i=0;i<N;i++){
                try{
                    int x = s.nextInt();
                    int y = s.nextInt();
                    System.out.println(as[x-1].get(y-1));
                }catch(IndexOutOfBoundsException e){
                    System.out.println("ERROR!");
                }
            }
        
    }
    
}
