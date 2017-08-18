/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistfunctions;

public class ArrayListFunctions {

    
    public static void main(String[] args) {
         
    MyArrayList list = new MyArrayList(5);
    
    list.add("Alpha");
    list.add("Beta");
    list.add("Gamma");
    list.add("Delta");
    list.add("Epsilon");
    list.add("Alpha");
    list.add("Beta");
    list.add("Gamma");
    
    
        System.out.println("The 3 element in the ArrayList:"+list.get(2));
        System.out.println("Present Size of the array:" + list.size());
        
        System.out.println("'Gamma' is in the " + list.search("Gamma") + " Index Position for Search Method.");
        System.out.println("'Gamma' is in the " + list.searchFromEnd("Gamma") + " Index Position for searchFromEnd Method.");
        System.out.println("The given String is repeated for "+   list.findMatches("Alpha") + " times.");
        
        int[] arr = list.findMatchesArray("Alpha");
        if(arr.length > 0){
        System.out.print("The given string is at ");
        for(int x: arr){ 
        System.out.print(" "+x+ ",");
        }    
        System.out.print(" index positions.");
        System.out.println();}
        else System.out.println("Match not found.");
    }
}
