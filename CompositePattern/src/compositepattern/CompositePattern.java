
package compositepattern;


public class CompositePattern {

    
    public static void main(String[] args) {
       
        EmployeeInterface developer1 = new Developer("jahid","1200","jr. Software Engineer");
        EmployeeInterface developer2 = new Developer("Sazzad","1190","jr. Software Engineer");
        EmployeeInterface developer3 = new Developer("Abrar","1090","jr. Software Engineer");
        
        CompanyDirectory developerDirectory = new CompanyDirectory();
        developerDirectory.addEmployee(developer3);
        developerDirectory.addEmployee(developer2);
        developerDirectory.addEmployee(developer1);
        
        EmployeeInterface hr = new HumanResources("Nafija Afruz", "500", "HR");
        CompanyDirectory humanResourcesDirectory = new CompanyDirectory();
        humanResourcesDirectory.addEmployee(hr);
        
        
        EmployeeInterface manager1 = new Manager("Nazmul Islam","101","Team Lead");
        EmployeeInterface manager2 = new Manager("Mushraful Anik","200","Director of Technology");
        
        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);
        
        
        CompanyDirectory entireComapanyDirectory  = new CompanyDirectory();
        entireComapanyDirectory.addEmployee(developerDirectory);
        entireComapanyDirectory.addEmployee(humanResourcesDirectory);
        entireComapanyDirectory.addEmployee(managerDirectory);
        entireComapanyDirectory.details();
        
        
    }
    
}
