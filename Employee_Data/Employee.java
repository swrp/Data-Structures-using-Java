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
public class Employee implements Cloneable{

    String employeeFirstName;
    String employeeLastName;
    int idNumber = 0;
    String dateOfBirth = new String();
    String salary = new String();
    Employee next;
    Employee values;
    
     public Employee()
     {
     
     }
    public Employee (Employee data)
    {
        employeeFirstName = data.getEmployeeFirstName();
        employeeLastName = data.getEmployeeLastName();
        idNumber = data.getIdNumber();
        dateOfBirth = data.getDateOfBirth();
        salary = data.getSalary();
    }
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSalary() {
        return salary;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
