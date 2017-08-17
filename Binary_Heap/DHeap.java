/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryheap;

/**
 *
 * @author swrp4505
 */
public class DHeap {

	private static int d;
	
	public DHeap(int child){
		
		d = child;
	}

	public static int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
}
