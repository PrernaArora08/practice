package com.personal.collectionspractice;

import java.util.ArrayList;

public class DerivedStack {
    private ArrayList<Integer> stackList = new ArrayList<>();
    private int top = 0;
    public void pushInStack(Integer element){
        System.out.println("Pushing in Stack" + element);
            stackList.add(top,element);
            top++;
    }
    public void  getTop(){
        if(top == 0)
            System.out.println("Empty Stack");
        else
            System.out.println("Get Top" + stackList.get(top-1));

    }
    public void printStack(){
        if(top == 0)
            System.out.println("Empty Stack");
        else {
            System.out.println("Printing Stack");
            for (int i = stackList.size() - 1; i >= 0; i--) {
                System.out.println(stackList.get(i));
            }
        }
    }
    public void popFromStack() {
        if (top == 0)
            System.out.println("Empty Stack");
        else {
            System.out.println("Popping from Stack" + stackList.get(top - 1));
            stackList.remove(top - 1);
            top--;
        }
    }

}
