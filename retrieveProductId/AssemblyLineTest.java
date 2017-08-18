/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package assemblylinetest;


public class AssemblyLineTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        
        AssemblyLine al = new AssemblyLine();
        printMyValues(al.insert(101,true));
        printMyValues(al.insert(102,true));
        printMyValues(al.insert(103,false));
        printMyValues(al.insert(104,true));
        printMyValues(al.insert(105,true));
        printMyValues(al.insert(106,false));
        printMyValues(al.insert(107,true));
        printMyValues(al.insert(108,false));
        printMyValues(al.insert(109,true));
        printMyValues(al.insert(110,true));
        printMyValues(al.insert(111,false));
        printMyValues(al.insert(112,false));
        printMyValues(al.insert(113,true));
        printMyValues(al.insert(114,false));
        printMyValues(al.insert(115,true));
        printMyValues(al.insert(116,false));
        printMyValues(al.insert(117,true));
        printMyValues(al.insert(118,false));
        printMyValues(al.insert(119,true));
        printMyValues(al.insert(120,false));
        
    }
    
    public static void printMyValues(ManufacturedProduct prudocutArray){
        if(prudocutArray!=null){
            System.out.println("last element in the array is : "+ prudocutArray.toString()); 
        }else{
            System.out.println("Last element is NULL");
        }
               
            }
    
}
