 
package IEEE;
 
import java.util.*;

public class prob04 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for(int i=0;i<test;i++){
            long N = s.nextInt();
            long A = s.nextInt();
            long B = s.nextInt();
            
            long sum =0;
            int k =0;
            int arr[] = new int[1000];
            for(int j=1;j<=B;j++){
                //System.out.print(" j "+j+" ");
                if(N%j == 0 && j!= 1){
                   arr[k]= j;  
                   k++;
                }else{
                    //System.out.print("awa "+j);
                    int l;
                    for(l=0;l<k;l++){
                        if(j%arr[l]==0 && j != 1){
                           //System.out.println(" set "+j+" "+arr[l]); 
                           break;
                        } 
                    }
                    if(l==k){
                        //System.out.println(j);
                        if( j>=A )
                        sum +=j;
                    }else{
                        //System.out.println("kk "+j);
                        arr[k] = j;
                        k++;
                    }
                   
                }
             
            }
           System.out.println(sum%1000000007);
        }
    
    }
}
