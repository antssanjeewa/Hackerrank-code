 
package hacker_algorithm;
 
import java.io.*;
import java.util.*;

public class SORT2 {
    public static void insertionSort(int[] A){
//        for(int i = 1; i < A.length; i++){
//            int value = A[i];
//            int j = i - 1;
//            while(j >= 0 && A[j] > value){
//                A[j + 1] = A[j];
//                j = j - 1;
//            }
//            A[j + 1] = value;
//             printArray(A);
//        }
        for(int i = A.length-1; i >= 0; i--){
            int value = A[i];
            int j = i-1;
            int tem = i;
            while(j >= 0){
                System.out.println(A[j]+" "+value);
                if(A[j] > A[i]){
                    value = A[i];
                    A[i] = A[j];
                    tem = j;
                }
                j = j - 1;
            }
            printArray(A);
            A[tem] = value;
           
        }
       
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}

