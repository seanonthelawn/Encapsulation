/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sean
 */
public class HumanResources {
    private ArrayList<Employee> employees;

    public HumanResources() {
        employees = new ArrayList();
    }
       
    
    public void HireEmployee(String fname, String lname, String ssn){
        Employee newEmployee = new Employee(fname, lname, ssn);
        employees.add(newEmployee);
        newEmployee.doFirstTimeOrientation("1");
        
    }
    

    public String[] getEmployeeNames(){
        String[] employeeList = new String[this.employees.size()];
        for (int i = 0; i<this.employees.size(); i++){
            employeeList[i] = employees.get(i).getLastName() + " ," + employees.get(i).getFirstName();
        }
        
        return employeeList;
        
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    
   
}
