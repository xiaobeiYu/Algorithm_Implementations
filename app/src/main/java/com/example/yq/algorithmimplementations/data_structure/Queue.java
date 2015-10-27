package com.example.yq.algorithmimplementations.data_structure;

/**
 * Created by yq on 10/25/15.
 */
public class Queue {
    private int element[];
    private int tail;
    private int head;
    private int size;
    public Queue(int s){
        size = s;
        tail = head  = 0;
        element = new int[size];
    }

    public void enqueue(int i){
        element[tail] = i;
        tail ++;
    }

    public int dequeue(int i ){
        int result = element[head];
        head ++;
        return result;
    }

    public void main(String[] args){
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);


    }
}
