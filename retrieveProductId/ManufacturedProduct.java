/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemblylinetest;

import java.util.Random;

public class ManufacturedProduct {
     
        private int productid;
        private boolean passedInspection;
        
        public ManufacturedProduct() {
            
        }
        public  ManufacturedProduct(int value, boolean inspection)
        {
            productid = value;
            passedInspection = inspection;
        }

    public int getProductid() {
        return productid;
    }

    public String toString()
    {
        return "Product ID:  " + this.productid + "After Inspection:  "+ this.passedInspection;
    }
    
    public void inspection(ManufacturedProduct manfProduct)
    {
        
        Random rand = new Random();
        int i = rand.nextInt(20);
        if (i == 0){
        manfProduct.passedInspection = false;
    }
        else {
        manfProduct.passedInspection = true;
        }
        
       System.out.println("Product ID : "+manfProduct.getProductid()+ " | Passed Inspection : "+manfProduct.passedInspection);
    }

}
