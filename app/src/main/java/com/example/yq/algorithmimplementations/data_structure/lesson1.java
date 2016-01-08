package com.example.yq.algorithmimplementations.data_structure;

/**
 * Created by yq on 1/8/16.
 */
public class lesson1 {
    public int solution(int N) {
        // write your code in Java SE 8
        int maxLength = 0;
        String binary = Integer.toString(N, 2);
        String[] results = binary.split("1");
        for(int i = 0; i<results.length; i++){
            if(results[i].length()>maxLength){
                maxLength = results[i].length();
            }
        }

        return maxLength;
    }
}
