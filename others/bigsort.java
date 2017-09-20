package others;

import java.math.BigInteger;
import java.util.*;

public class bigsort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigInteger arr[] = new BigInteger[N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextBigInteger();
            
        }
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }    

    }
    
}
