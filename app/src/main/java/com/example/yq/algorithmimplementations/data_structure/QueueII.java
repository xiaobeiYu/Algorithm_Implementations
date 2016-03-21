package com.example.yq.algorithmimplementations.data_structure;

import java.util.*;

/**
 * Created by yq on 3/20/16.
 */
public class QueueII {
    public class MyQueue<T>{
        private  static class QueueNode<T>{
            private T data;
            private QueueNode<T> next;

            public QueueNode(T data){
                this.data = data;
            }
        }

        private QueueNode<T> first;
        private QueueNode<T> last;

        public void add(T item){
            QueueNode<T> t =new QueueNode<T>(item);
            if(last != null){
                last.next = t;
            }
            last = t;
            if(first == null){
                first = last;
            }
        }

        public T remove(){
            if(first == null) throw new NodeSuchElementException();
            T data = first.data;
            first = first.next;
            if(first == null){
                last = null;
            }
            return data;
        }

        public  T peek(){
            if (first == null) throw new EmptyStackException();
            return first.data;
        }

        public boolean isEmpty(){
            return first == null;
        }
    }
}
