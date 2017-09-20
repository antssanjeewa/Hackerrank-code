 package IEEE;

import java.util.*;
 

 public class prob01 {
    Scanner s = new Scanner(System.in);
     
    public static void main(String args[]){
    
        prob01 p = new prob01();
        
        int textcases = p.s.nextInt();
        for(int i =0;i<textcases;i++){
            p.test();
        }
   }

    
    public void test(){
        int dognumber  = s.nextInt();
        int dogwalker  = s.nextInt();
        ArrayList<Integer> dogweight = new ArrayList<Integer>();
        //int dogweight[] = new int[dognumber];
        for(int i = 0;i < dognumber;i++){
            dogweight.add(s.nextInt());
        }
        Collections.sort(dogweight);
        int remain = dognumber%dogwalker;
        int count = 0;
        int sum = 0;
        
        int k =0;
        while(count != remain){
            int gap = dogweight.get(1)- dogweight.get(0);
            //System.out.println("d"+dogweight+"   "+remain);
            //System.out.println("size "+dogweight.size());
            //System.out.println("cou "+count+"rem"+remain);
        for(int i = 0;i<dogweight.size()-1;i++){
            int diff = dogweight.get(i+1)- dogweight.get(i);
            //System.out.println("i "+i+" "+dogweight.get(i)+"diff "+diff);
            if(diff<gap){
                gap = diff;
                //System.out.println("gap "+gap);
                //sum += diff;
                k = i;
                
                 
            }
        }
        //System.out.println("sum "+sum);
        count++;
        sum+=gap;
        dogweight.remove(k);
        dogweight.remove(k);
        }
        if(remain == 0){
            if(dognumber == dogwalker){
                sum =0;
            }else{
                sum =0;
                count = dognumber/dogwalker;
                for(int i = 0;i<dognumber;i+=count){
                    for(int j=i;j<count;j++){
                        sum += (dogweight.get(j+1)- dogweight.get(j)); 
                    }
                }
            }
        
        }
        System.out.println(sum);
    }  
}
