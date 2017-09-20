package javacode;
import java.util.*;
/**
 *
 * @author ANTS
 */
public class Ann {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int max = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;i+j<=N;j++){
                for(int k=1;i+j+k<=N;k++){
                    int sum = i*j*k;
                    //System.out.println(i+" "+j+" "+k+" "+max);
                    if((i+j+k) == N && sum >max)
                        max = sum;
                       
                }
            } 
        }
        System.out.println(max);
    }
    
}
