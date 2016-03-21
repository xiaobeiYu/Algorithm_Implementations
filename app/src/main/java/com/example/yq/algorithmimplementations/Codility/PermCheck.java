package com.example.yq.algorithmimplementations.Codility;

import java.util.Arrays;

/**
 * Created by yq on 1/8/16.
 */
public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int min = A[0];
        for(int i = 0 ; i < A.length; i++){
            if(A[i] == min){
                min++;
            }
            System.out.print(A[i]);
        }
        if(min == A[A.length -1 ]+1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
