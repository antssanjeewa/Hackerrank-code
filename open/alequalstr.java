package open;
import java.util.*;
public class alequalstr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        char [] letter = new char[N];
        letter = s.next().toCharArray();
        int num = s.nextInt();
        while(num-- >0){
            int a1 = s.nextInt()-1;
            int a2 = s.nextInt()-1;
            int b1 = s.nextInt()-1;
            int b2 = s.nextInt()-1;
            
            int count = 0;
            int diff = a2-a1;
            for(int i=0;i<=diff;i++){
                count += Math.abs(letter[b1+i] - letter[a1+i]);
            }
            if(count > 1){
                System.out.println("DIFFERENT");
            
            }else{
                System.out.println("SIMILAR");
            
            }
        }
    }
    
}
