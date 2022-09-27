package com.personal.collectionspractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuffer  sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String ll = "LinkedList";
        String stack = "Stack";
        String queue = "Queue";
        String hashmap = "HashMap";

        System.out.println("please select a DS for demo");
        System.out.println("1." + ll);
        System.out.println("2." +stack);
        System.out.println("3." +queue);
        System.out.println("4." +hashmap);

        sb.append(sc.nextLine());

        if (ll.contentEquals(sb)){
            addDataInLinkedList();
        } else if(stack.contentEquals(sb)){
                addDataInStack();
            }
        else if(queue.contentEquals(sb)){
            addDataInQueue();
        }
        else if(hashmap.contentEquals(sb)){
            addDataInHashMap();
        }
        else
            System.out.println("Please enter a valid DS");
        }


    private static void addDataInLinkedList(){
            DerivedLinkedList derivedLinkedList = new DerivedLinkedList();
            derivedLinkedList.addNode(2);
            derivedLinkedList.addNode(6);
            derivedLinkedList.addNode(8);
            derivedLinkedList.addNode(9);
            derivedLinkedList.addNode(10);
            derivedLinkedList.getLinkedList();
            derivedLinkedList.deleteNode(6);
            derivedLinkedList.getLinkedList();
            derivedLinkedList.addNode(6);
            derivedLinkedList.getLinkedList();
        }
        private static void addDataInStack(){
            DerivedStack derivedStack = new DerivedStack();
            derivedStack.pushInStack(1);
            derivedStack.pushInStack(3);
            derivedStack.pushInStack(5);
            derivedStack.pushInStack(7);
            derivedStack.getTop();
            derivedStack.printStack();
            derivedStack.popFromStack();
            derivedStack.pushInStack(2);
            derivedStack.pushInStack(4);
            derivedStack.getTop();
            derivedStack.popFromStack();
            derivedStack.getTop();
            derivedStack.pushInStack(100);
            derivedStack.printStack();
        }
    private static void addDataInQueue(){
        DerivedQueue derivedQueue = new DerivedQueue();
        derivedQueue.dequeue();
        derivedQueue.addToQueue(7);
        derivedQueue.addToQueue(3);
        derivedQueue.addToQueue(44);
        derivedQueue.addToQueue(55);
        derivedQueue.printQueue();
        derivedQueue.dequeue();
        derivedQueue.addToQueue(66);
        derivedQueue.printQueue();
        derivedQueue.dequeue();
        derivedQueue.printQueue();
        derivedQueue.addToQueue(68);
        derivedQueue.addToQueue(6690);
        derivedQueue.addToQueue(667);
        derivedQueue.dequeue();
        derivedQueue.printQueue();
    }
    private static void addDataInHashMap() {
        DerivedHashMap derivedHashMap = new DerivedHashMap();
        derivedHashMap.addToHashMap(56,23);
        derivedHashMap.addToHashMap(56,56);
        derivedHashMap.getKeyValue(56);
        derivedHashMap.addToHashMap(43,44);
        derivedHashMap.getKeyValue(43);
    }


    }
