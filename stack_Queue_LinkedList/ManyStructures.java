/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystructuresdriver;


public class ManyStructures {
        private long[] values;
        
        public ManyStructures( int maxsize){
        
        values = new long[maxsize];
        }

    public long[] getValues() {
        return values;
    }

    public void setValues(long[] values) {
        this.values = values;
    }
    
    public long[] getArray(){
    
    long[] copyArray = new long[values.length];
    for (int i = 0; i<values.length;i++){
    copyArray[i] = values[i];
    }
    return copyArray;
    }
    
    public Queue getQueue(){
     
    Queue q = new Queue(values.length);   
        for(int i =0; i< values.length; i++){
        q.insert(values[i]);
        }
        return q;
    }
    
    public Stack getStack(  ){
        
        Stack s = new Stack(values.length);   
        for(int i =0; i< values.length; i++){
        s.push(values[i]);
        }
        return s;
    }

    public LinkedList getLinkedList()
    {
        LinkedList first = null ;
        LinkedList newLinkCons = null; 
        for (int i = values.length-1; i >= 0; i--) {
            newLinkCons = new LinkedList(values[i]);
            newLinkCons.next = first;
            first = newLinkCons;
        }

    return newLinkCons;
    }
    
}
