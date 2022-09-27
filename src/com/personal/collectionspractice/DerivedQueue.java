package com.personal.collectionspractice;

import java.util.ArrayList;

public class DerivedQueue {
    ArrayList<Integer> derivedQueue = new ArrayList<>();
    private int head = -1;
    private int tail = 0;

    public void addToQueue(Integer element){
        if(head == -1 ){
            head = 0;
        }
        System.out.println("Adding to Queue" + element);
        derivedQueue.add(tail,element);
        tail++;
    }
    public void printQueue(){
        if(head == -1)
            System.out.println("Empty Queue");
        else {
            System.out.println("Printing the Queue");
            for (int i = 0; i < derivedQueue.size(); i++) {
                System.out.println(derivedQueue.get(i));
            }
        }
    }
    public void dequeue(){
        if(head == -1)
            System.out.println("Empty Queue");
        else {
            System.out.println("Removing" + derivedQueue.get(head));
            derivedQueue.remove(head);
            tail--;
        }
    }
}
