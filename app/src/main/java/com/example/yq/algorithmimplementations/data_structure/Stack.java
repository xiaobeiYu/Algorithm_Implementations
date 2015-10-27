package com.example.yq.algorithmimplementations.data_structure;

/**
 * Created by yq on 10/25/15.
 */
public class Stack {
    private int maximumSize;
    private int top;
    private int elements[];

    public Stack(int s){
        maximumSize = s;
        top = -1;
        elements = new int[maximumSize];

    }

    public void push(int value){
            top++;
            elements[top] = value;
    }

    public int pop(){
        int result = elements[top];
        top --;
        return result;
    }

    public int top(){
        return elements[top];
    }

    public boolean isFull(){
        if( top == maximumSize -1)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

    public void main(String[] args){
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);


    }
}
