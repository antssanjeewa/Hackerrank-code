 
package hacker_algorithm;
import java.util.*;
public class kruskal {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = s.nextInt();
        int m = s.nextInt();
        int [][]arr = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            arr[x][y] = s.nextInt();
        }
        int start = s.nextInt();
        int sum =0;
        start = 1;
        int j =0;
        while(start<=n){
            if(list.contains(start)){
                start++;
                continue;
            }
            int count = Integer.MAX_VALUE;
            for(int i=1;i<=n;i++){
                
               if(arr[start][i]!=0 && arr[start][i]<count){
                   System.out.println(start+" "+i+"i "+arr[start][i]);
                   count = arr[start][i];
                   j=i;
               }
               if(arr[i][start]!=0 && arr[i][start]<count){
                   System.out.println(i+"i "+start+" "+arr[i][start]);
                   count =  arr[i][start];
                   j = i;
               }
            }
             
            //System.out.println(start+" j"+j+" "+count);
        sum += count;
        list.add(j);
        list.add(start);
        start++;    
        }    
        System.out.println(sum);
    }
    
}
