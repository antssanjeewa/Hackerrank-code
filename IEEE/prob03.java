 package IEEE;

import java.util.*;

 public class prob03 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int Q = s.nextInt();
        char map[][] = new char[N][M];
        for(int i=0;i<N;i++){
          map[i] = s.next().toCharArray();
        }
        for(int i=0;i<Q;i++){
           int x1 =s.nextInt()-1;
           int y1 =s.nextInt()-1;
           int x2 =s.nextInt()-1;
           int y2 =s.nextInt()-1;
           //System.out.println(x1+" "+y1+" "+x2+" "+y2);
           int land = 0;
           int land2 = 0;
           if(x1 <= x2){
               if(y1 <= y2){
                   int enable  = 0;
                    for(int j=x1;j<=x2;j++){
                        if(map[j][y1]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[j][y1]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=y1;j<=y2;j++){
                        if(map[x2][j]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[x2][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    enable  = 0;
                    for(int j=y1;j<=y2;j++){
                        if(map[x1][j]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[x1][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=x1;j<=x2;j++){
                        if(map[j][y2]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[j][y2]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    if(land < land2){
                        System.out.println(land);
                    }else{
                        System.out.println(land2);
                    }
                    
               }else{
                   int enable  = 0;
                    for(int j=x1;j<=x2;j++){
                        if(map[j][y1]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[j][y1]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=y1;j>=y2;j--){
                        if(map[x2][j]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[x2][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    enable  = 0;
                    for(int j=y1;j>=y2;j--){
                        if(map[x1][j]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[x1][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=x1;j<=x2;j++){
                        if(map[j][y2]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[j][y2]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    if(land < land2){
                        System.out.println(land);
                    }else{
                        System.out.println(land2);
                    }
               }
           }else{
               if(y1 < y2){
                   int enable  = 0;
                    for(int j=x1;j>=x2;j--){
                        if(map[j][y1]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[j][y1]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=y1;j<=y2;j++){
                        if(map[x2][j]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[x2][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    enable  = 0;
                    for(int j=y1;j<=y2;j++){
                        if(map[x1][j]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[x1][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=x1;j>=x2;j--){
                        if(map[j][y2]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[j][y2]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    if(land < land2){
                        System.out.println(land);
                    }else{
                        System.out.println(land2);
                    }
               }else{
                   int enable  = 0;
                    for(int j=x1;j>=x2;j--){
                        if(map[j][y1]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[j][y1]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=y1;j>=y2;j--){
                        if(map[x2][j]=='O' && enable==0){
                            enable = 1;
                            land++;
                        }else if(map[x2][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    enable  = 0;
                    for(int j=y1;j>=y2;j--){
                        if(map[x1][j]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[x1][j]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    for(int j=x1;j>=x2;j--){
                        if(map[j][y2]=='O' && enable==0){
                            enable = 1;
                            land2++;
                        }else if(map[j][y2]=='~' && enable==1){
                            enable = 0;
                        }
                    }
                    if(land < land2){
                        System.out.println(land);
                    }else{
                        System.out.println(land2);
                    }
               }
           }
           
        }
    }
}
