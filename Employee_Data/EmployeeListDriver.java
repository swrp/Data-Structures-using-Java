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
public class EmployeeListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] employees = new Employee[3];
        Employee employee = new Employee();
        employee.setEmployeeFirstName("Taraka");
        employee.setEmployeeLastName("Swaroop");
        employee.setIdNumber(0);
        employee.setDateOfBirth("11-09-1994");
        employee.setSalary("$450");
        employees[0]=employee;
        
        Employee employee1 = new Employee();
        employee1.setEmployeeFirstName("Ram");
        employee1.setEmployeeLastName("Bhai");
        employee1.setIdNumber(1);
        employee1.setDateOfBirth("11-09-1991");
        employee1.setSalary("$4500");
        employees[1]=employee1;
        
        
        Employee employee2 = new Employee();
        employee2.setEmployeeFirstName("indra");
        employee2.setEmployeeLastName("teja");
        employee2.setIdNumber(2);
        employee2.setDateOfBirth("11-09-1993");
        employee2.setSalary("$450");
        employees[2]=employee2;
        EmployeeLinkedList emp = new EmployeeLinkedList(employees);
    
        Employee findEmployee =  emp.find(1);
        System.out.println("First Name:  "+findEmployee.employeeFirstName);
        System.out.println("Last Name:  "+ findEmployee.employeeLastName);
        System.out.println("Date of Birth:  "+ findEmployee.dateOfBirth);
        System.out.println("Salary:  "+findEmployee.salary);
    }
    
}
