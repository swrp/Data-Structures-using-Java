/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystructuresdriver;

/**
 *
 * @author swrp4505
 */
public class Stack
{
private int maxSize; 
private long[] stackArray;
private int top;


public Stack(int s) 
{
maxSize = s; 
stackArray = new long[maxSize]; 
top = -1;
}

public void push(long j) 
{
stackArray[++top] = j; 
}

public long[]  getStackArray(){
return stackArray;
}
}