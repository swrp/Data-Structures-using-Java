/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystructuresdriver;

public class ManyStructuresDriver {

    
    public static void main(String[] args) {
        ManyStructures ms = new ManyStructures(5);
        long[] items = {12,45,66,55,71};
        ms.setValues(items);
        long [] arrayValues = ms.getArray();
        System.out.print("Array values: ");
        for(int i =0; i<items.length;i++)
            System.out.print("  "+arrayValues[i]);
            System.out.println();
            
            System.out.println();
        
            System.out.print("Queue values:");
        Queue[] queues= new Queue[items.length];
      Queue qa = ms.getQueue();
      long[] queueLongValues = qa.getQueueArray();
        for(int i =0; i < queueLongValues.length ;i++){
            
            System.out.print("  "+ queueLongValues[i]);
          
      } 
            System.out.println();
            System.out.println();
            System.out.print("Stack values:");
        Stack[] stacks= new Stack[items.length];
      Stack sa = ms.getStack();
      long[] stackLongValues = sa.getStackArray();
        for(int i =stackLongValues.length-1; i >= 0;i--){
            
            System.out.print("  "+ stackLongValues[i]);
          
      } 
        System.out.println();
        System.out.println();
        System.out.print("Linked List values:");
        LinkedList current = ms.getLinkedList();
        while (current != null) 
        {
            current.displayLink();
            current = current.next;
           
        }
        System.out.println();
}
}
