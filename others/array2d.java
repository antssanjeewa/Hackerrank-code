package others;
import java.util.*;
public class array2d {

    public static void main(String[] args) {
        int array[][] = new int[6][6];
        Scanner s = new Scanner(System.in);
        int sum = 0,max =0;
        
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                array[i][j] = s.nextInt();
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if(sum > max)
                    max = sum;
                System.out.println(i+" "+j+" "+max);
            }
        }
    }
    
}
