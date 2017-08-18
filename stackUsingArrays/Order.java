/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritystackdriver;

/**
 *
 * @author swrp4505
 */
public class Order {
     private String order_code;
        private int order_priority;
        public Order(String orderCode,int orderPriority){
            order_code = orderCode;
            order_priority = orderPriority;
            
            
        }
        public int getOrderPriority(){
                return order_priority;
            }
        
        public String getOrderCode(){
            return order_code;
        }
        
        public String toString()
        {
            return "Order_Priority: "+this.order_priority+"  Order_code: "+this.order_code;
        }
}
