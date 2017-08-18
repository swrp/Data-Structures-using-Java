/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package assemblylinetest;


public class AssemblyLine {
    
    
   private  ManufacturedProduct [] productArray = new ManufacturedProduct[5];
   
   ManufacturedProduct manfaManufacturedProduct = new ManufacturedProduct();
    
        
    public ManufacturedProduct insert(int Id, boolean value)
    {
        for(int i=4 ; i > 0 ; i--)
        {
            productArray[i] = productArray[i-1]; 
        }
        productArray[0] = new ManufacturedProduct(Id,value);
        manfaManufacturedProduct.inspection(productArray[0]);
        return productArray[4];
    }
    public ManufacturedProduct[] getData()
    {
    return productArray;
    }
}
