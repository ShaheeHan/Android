package compositepattern;

import java.util.ArrayList;

public class CompanyDirectory implements EmployeeInterface {
    
    ArrayList<EmployeeInterface> employeeList;
    
    public CompanyDirectory()
    {
        employeeList = new  ArrayList<EmployeeInterface> ();
    }
    @Override
    public void details() {
        
        for(EmployeeInterface employee: employeeList)
        {
            employee.details();
        }
    }
    
    public void addEmployee(EmployeeInterface employee)
    {
        employeeList.add(employee);
    }
    
    public void removeEmployee(EmployeeInterface employee)
    {
        employeeList.remove(employee);
    }
    
}
