package others;
import java.util.*;
public class circleansqure {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int W = s.nextInt();
        int H = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int r = s.nextInt();
        
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();
        
        int m1 = (y1-y3)/(x1-x3);
        int x0 = x1-x3;
        int y0 = y1-y3;
        
        
        for(int i=0;i<=W;i++){
            for(int j=0;j<=H;j++){
                if(Math.pow((i-x),2.0)+Math.pow((j-y),2.0) <= Math.pow(r,2.0)){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
             System.out.println("");
        }
        
    }
    
}
