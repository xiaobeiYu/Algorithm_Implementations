package com.example.yq.algorithmimplementations.data_structure;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by yq on 1/7/16.
 */
import java.util.HashMap;
public class Hash {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap hm = new HashMap();
        int key = 0;
        int value = 0;
        //build the hashmap
        //store the value and its count
        for(int i = 0; i< A.length; i++){
            if(hm.containsKey(A[i])){
                value = (Integer)hm.get(A[i]);
                hm.put(A[i], value+1);
            }
            else{
                hm.put(A[i],1);
            }
        }

        // find the value that appear only once
        Iterator i = hm.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry pair = (Map.Entry)i.next();
            //System.out.println(pair.getKey() + ":" + pair.getValue());
            if((Integer)pair.getValue() == 1){
                key = (Integer)pair.getKey();
            }
        }
        // System.out.print(key);
        return key;
    }
}
