/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystructuresdriver;

public class LinkedList {
    private long data;
    LinkedList next;

public LinkedList (long item)
{
    data = item;
}
public void displayLink()      // display ourself
      {
      System.out.print(" "+data + " ");
      }

}