/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Jahid
 */
public class HumanResources implements EmployeeInterface{

    private String name;
    private String designation;
    private String id;
    
    public HumanResources(String name, String id, String designation)
    {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }
    @Override
    public void details() {
     
        System.out.println("Name: "+name+ " Id: "+id+" Designation: "+designation);
        
    }
    
}
