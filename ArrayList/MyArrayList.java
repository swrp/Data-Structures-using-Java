/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistfunctions;


public class MyArrayList {
    
    private String [] masterArray;
    int count=1;
    String [] copyArray = null;
    public  MyArrayList(int maxSize)
    {
       masterArray = new String [maxSize]; 
    }
    
    public void add(String item)
    {  
       if (count <= masterArray.length )
         {
           for ( int i = 0; i < masterArray.length ; i++)
        {  
            if (masterArray[i] == null){
                masterArray[i] = item;
                count++;
                break;
            }
        }
         }
          
         
        else 
        {  
            
                copyArray = new String[masterArray.length*2];
                for (int i = 0 ; i < masterArray.length; i++)
                {
                 copyArray[i] = masterArray[i];
                }
                copyArray[count-1] = item;
                masterArray = copyArray;
        } 
            }
    
    public String get (int index)
    {       
            String indexElement = null;
            int inc =0;
            while ( index != inc)
            {
                inc++;
            }
            indexElement = masterArray[inc];
            return indexElement;
    }

    public int size()
    {
     return masterArray.length;
    }
    
    public int search( String keyWord)
    {   int indexNum = -1;
        
    while( masterArray[indexNum+1] != keyWord)
        indexNum++;
        return indexNum;
    }
    
    public int searchFromEnd( String word)
    {   int indexNum = masterArray.length-1;
        
        while( masterArray[indexNum] != word)
        indexNum--;
    
        return indexNum;
    }
    
    public int findMatches(String match)
    {
        int repeated =0;
        int index =0;
        while( index < masterArray.length)
        {
            if (masterArray[index] == match)
            { repeated++; }
             index++;
        }
        return repeated;
    }
    
    public int [] findMatchesArray(String match)
    {
        int [] indexValues = new int [findMatches(match)];
        int count =0 ;
        for (int i = 0; i < masterArray.length ; i++)
        {
            if (masterArray[i] == match)
            {indexValues[count] = i;
                count++;
        }}
        return indexValues;
    }
}  

