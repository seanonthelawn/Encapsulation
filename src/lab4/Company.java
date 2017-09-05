/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Sean
 */
public class Company {
   private HumanResources hr;
   private String name;
   
   
   public Company (String name){
       this.name = name;
       hr = new HumanResources();
   }
   
   public void hireEmployeee(String fname, String lname, String ssn){
       this.hr.HireEmployee(fname, lname, ssn);
   }
   
   private String[] getEmployees(){
       return this.hr.getEmployeeNames();
   }
   
   public void printEmployeeNames(){
      String[] names = getEmployees();
      for (int i=0; i<names.length; i++){
          System.out.println(names[i]);
      }
     
   }  
   
    public HumanResources getHr() {
        return hr;
    }

    public void setHr(HumanResources hr) {
        this.hr = hr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
}
