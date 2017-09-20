
package euler;
import java.util.*;
public class gride {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[20][20];
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int sum =0 ;
        for(int i=0;i<20;i++){
            for(int j=0;j<17;j++){
                int num = arr[i][j]*arr[i][j+1]*arr[i][j+2]*arr[i][j+3];
                if(num > sum)
                    sum = num;
            }
        }
        for(int i=0;i<20;i++){
            for(int j=0;j<17;j++){
                int num = arr[j][i]*arr[j+1][i]*arr[j+2][i]*arr[j+3][i];
                if(num > sum)
                    sum = num;
            }
        }
        for(int i=0;i<17;i++){
            for(int j=0;j<17;j++){
                int num = arr[1+i][j+1]*arr[2+i][j+2]*arr[3+i][j+3]*arr[i][j];
                if(num > sum)
                    sum = num;
            }
        }
        for(int i=0;i<17;i++){
            for(int j=0;j<17;j++){
                int num = arr[i][19-j]*arr[1+i][18-j]*arr[2+i][17-j]*arr[3+i][16-j];
                if(num > sum)
                    sum = num;
            }
        }
        System.out.println(sum);
    }
    
}
