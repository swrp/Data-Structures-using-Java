/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritystackdriver;

public class PriorityStack {
        private int maxSize; // size of stack array
        private Order[] stackArray;
        private int top = 0; // top of stack
        
        public PriorityStack(int s) // constructor
            {
                maxSize = s; // set array size
                stackArray = new Order[maxSize]; // create array
                top = -1; // no items yet
            }
        public void push(Order obj) // put item on top of stack
            {
            stackArray[++top] = obj;
            // increment top, insert item
            }
        public Order pop() // take item from top of stack
            {
                System.out.println("Total values in stack after deleting is "+top );
                return stackArray[top--];
            }
        public Order peek() // peek at top of stack
            {
            System.out.println("Top element in the stack after push:  "+stackArray[top]);
            return stackArray[top];
            }
        public boolean isEmpty() // true if stack is empty
            {
            return (top == -1);
            }
        public boolean isFull() // true if stack is full
            {
            return (top == maxSize-1);
            }
        
        
        public int numberOfOrders()
        {        
            int i = 0;
            while (stackArray[i] != null)
                {
                i++;
                }
            return i ;
        }
        
        public void prioritySort(int n)
        {  
            for (int j = 1; j < n; j++) {  
            Order item = stackArray[j];  
            int i = j-1;  
            while ( (i > -1) && ( stackArray[i].getOrderPriority() > item.getOrderPriority() ) ) {  
                stackArray [i+1] = stackArray [i];  
                i--;  
            }  
            stackArray[i+1] = item; 
        }      System.out.println();
           System.out.println("After sorting the array:  ");
           for (int count=0; count<n; count++)
                System.out.println(stackArray[count]);
        
        }
        
}
