 package IEEE;

import java.util.*;

 public class prob031 {
     static int N;
     static int M; 
     static char map[][];
     static int k;
    static int count;
    static int enable;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        int Q = s.nextInt();
        map = new char[N][M];
        for(int i=0;i<N;i++){
          map[i] = s.next().toCharArray();
        }
        for(int i=0;i<Q;i++){
           int x1 =s.nextInt()-1;
           int y1 =s.nextInt()-1;
           int x2 =s.nextInt()-1;
           int y2 =s.nextInt()-1;
           k =100;
           count =0;
           enable = 0;
           if(x1<=x2 && y1<=y2){ 
               test(x1,y1,x2,y2);
           }else if(x1>=x2 && y1>=y2){ 
               test(x2,y2,x1,y1);
           }else if(x1<x2 && y1>y2){ 
               test2(x1,y1,x2,y2);
           }else if(x1>x2 && y1<y2){ 
               test2(x2,y2,x1,y1);
           } 
           
           
        }
    }
    
    public static void test(int x1,int y1,int x2,int y2){
        System.out.print(x1+" "+y1+" "+enable+" (k "+count+")- ");
        if(x1==x2 && y1 ==y2){
            System.out.println(k+" "+count+"- ");
            if(count< k){
                k = count;
                System.out.println(k);
            }
            enable = 0;
            count = 0;
               
        }else if(x1==x2){
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test(x1,y1+1,x2,y2);
        }else if(y1==y2){
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test(x1+1,y1,x2,y2);
        }else{
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test(x1+1,y1,x2,y2);
            test(x1,y1+1,x2,y2);
        }
    }
    public static void test2(int x1,int y1,int x2,int y2){
        int enable1 =0; 
        System.out.print(x1+" "+y1+" "+enable+" (cou "+count+")- ");
        if(x1==x2 && y1 ==y2){
            System.out.println(k+" "+count+" "+enable1+"- ");
            if(count< k){
                k = count;
                System.out.println(k);
            }
            enable = 0;
            count = 0;
             
            
        }else if(x1==x2){
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++; enable1++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test2(x1,y1-1,x2,y2);
        }else if(y1==y2){
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++;  enable1++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test2(x1+1,y1,x2,y2);
        }else{
            if(map[x1][y1]=='O' && enable==0){
                  enable = 1;
                  count++;  enable1++;
            }else if(map[x1][y1]=='~' && enable==1){
                 enable = 0;
            }
            test2(x1+1,y1,x2,y2);
            test2(x1,y1-1,x2,y2);
        }
    }
}

