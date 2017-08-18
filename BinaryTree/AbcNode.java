/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abctreeapp;

/**
 *
 * @author swrp4505
 */
class AbcNode
{
	public String sData;			//data item (key)
	public AbcNode leftChild;
	public AbcNode rightChild;
	
	public void displayNode()
	{
		System.out.print("{" + sData + "}");
	}
}
