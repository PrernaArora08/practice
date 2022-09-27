package com.personal.collectionspractice;

public class DerivedLinkedList{

   public DerivedNode head = null;
   public DerivedNode tail = null;

   public DerivedNode addNode(Integer val){
       DerivedNode derivedNode = new DerivedNode();
       derivedNode.setValue(val);
       derivedNode.setAddress(null);
       System.out.println("adding new node " + derivedNode.getValue());
      if (this.head == null) {
          head = derivedNode;
      }
      else {
         tail.setAddress(derivedNode);
      }
       tail = derivedNode;
      return derivedNode;
   }
  public void getLinkedList() {
      if (head == null) {
         System.out.println("Empty List");
      }
      if (head.getAddress() == null ) {
         System.out.println(head.getValue());
      }
      else {
         DerivedNode iteratorPtr = head;
         while(iteratorPtr != null){
            System.out.println(iteratorPtr.getValue());
            iteratorPtr = iteratorPtr.getAddress();
         }
      }
  }

  public void deleteNode(Integer val){
      DerivedNode iteratorPtr = head;
      DerivedNode iteratorPtrTwo = null;
      System.out.println("deleting node with value " + val );
       while(iteratorPtr.getValue() != val){
           iteratorPtrTwo = iteratorPtr;
           iteratorPtr = iteratorPtr.getAddress();
       }
       iteratorPtrTwo.setAddress(iteratorPtr.getAddress());
       iteratorPtr.setAddress(null);
  }



}
