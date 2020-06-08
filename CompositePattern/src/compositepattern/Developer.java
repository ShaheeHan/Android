
package compositepattern;

public class Developer implements EmployeeInterface{

    private String name;
    private String designation;
    private String id;
    
    public Developer(String name, String id, String designation)
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