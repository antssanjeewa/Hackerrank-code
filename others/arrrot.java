package others;
import java.util.*;
public class arrrot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N =  s.nextInt();
        int R = s.nextInt();
        int arr[] = new int [N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextInt();
        }
        
        for(int i=0;i<N;i++){
            int P = (i-N)+R+N;
            System.out.println(arr[P%N]);
        }
    }
    
}
