
package prioritystackdriver;

 
public class PriorityStackDriver {

    public static void main(String[] args) 
    {
        int maxSize=5;
         PriorityStack ps = new PriorityStack(maxSize);
         Order order1 = new Order("Order01",123);
         ps.push(order1);
         ps.peek();
         if ( ps.isEmpty() == true)
             System.out.println("Stack is empty");
         else System.out.println("Stack is Not Empty");
         if(ps.isFull() == true)
             System.out.println("Stack is Full");
         else System.out.println("Stack is not Full");
         System.out.println("Numbers of Orders in the stack:  "+ps.numberOfOrders());
         
         
         
         Order order2 = new Order("Order02",232);
         ps.push(order2);
         ps.peek();
         if ( ps.isEmpty() == true)
             System.out.println("Stack is empty");
         else System.out.println("Stack is Not Empty");
         if(ps.isFull() == true)
             System.out.println("Stack is Full");
         else System.out.println("Stack is not Full");
         System.out.println("Numbers of Orders in the stack:  "+ps.numberOfOrders());
         
         
        Order order3 = new Order("Order03",225);
         ps.push(order3);
         ps.peek();
         if ( ps.isEmpty() == true)
             System.out.println("Stack is empty");
         else System.out.println("Stack is Not Empty");
         if(ps.isFull() == true){
             System.out.println("Stack is Full");
         }else{
             System.out.println("Stack is not Full");
         } 
         System.out.println("Numbers of Orders in the stack:  "+ps.numberOfOrders());
         
         
         
         ps.prioritySort(ps.numberOfOrders());
         
         ps.peek();
         ps.pop();
         
         ps.peek();
         ps.pop();
         
         ps.peek();
         ps.pop();
         
        // TODO code application logic here
    
   
}
}