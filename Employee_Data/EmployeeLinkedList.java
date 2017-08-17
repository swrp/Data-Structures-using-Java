/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeelistdriver;

/**
 *
 * @author swrp4505
 */
public class EmployeeLinkedList {
    
Employee details;
int [] id;  
public EmployeeLinkedList ()
{
    details = null;
}


public EmployeeLinkedList(Employee [] data)
{
    
    for (int i = 0 ; i < data.length; i++){
    Employee nextEmpDetails = new Employee(data[i]);
    nextEmpDetails.next = details;
    details = nextEmpDetails;
}}

public Employee find(int identity)
{
    Employee clonedObject= null;
    Employee current = details;
    try {
        while (current.idNumber != identity) 
        {
            if (current.next == null) 
            {
                return null;               
            } else 
            {
                current = current.next;    
            }
        }
        clonedObject= (Employee)current.clone();                  
    }
    catch( CloneNotSupportedException e){
        
 }
    return clonedObject;
}
}
