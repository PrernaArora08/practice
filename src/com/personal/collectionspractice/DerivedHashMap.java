package com.personal.collectionspractice;

import java.util.Map;

// This is not working as of now, it needs to be fixed.
public class DerivedHashMap {

    Map<Integer,DerivedNode> hashMapImplementation ;
    DerivedLinkedList dll = new DerivedLinkedList();
    private Integer calcHashCode(Integer element){
        return (element%31);
    }

    public void addToHashMap(Integer k, Integer val ){
        Integer key =  calcHashCode(k);
           DerivedNode n = dll.addNode(val);
           hashMapImplementation.put(key,n);
    }

    public void getKeyValue(Integer k){
        Integer key =  calcHashCode(k);
        if(hashMapImplementation.containsKey(k))
            System.out.println("Here is the Key Pair: "+ hashMapImplementation.get(key));
        else
            System.out.println("Do not contain this key");
    }
}
