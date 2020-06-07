
package templatepattern;

import java.util.Scanner;

public class MakeCoffee extends Beverage {

    boolean customerWantsCondiments()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("You want coffee with Milk and sugar, y/n? ");
        String answer = sc.nextLine();
        if(answer.equals("y"))
            return true;
        else 
            return false;
    }
    @Override
    void brew() {
        
        System.out.println("Coffee is brewing");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
       
    }
    
}
