
package templatepattern;

import java.util.Scanner;

public class MakeTea extends Beverage {
    
    boolean customerWantsCondiments()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("You want tea with lemon, y/n? ");
        String answer = sc.nextLine();
        if(answer.equals("y"))
            return true;
        else 
            return false;
    }
    @Override
    void brew() {
         System.out.println("Tea is brewing");
    }

    @Override
    void addCondiments() {
         System.out.println("Adding lemon");
    }
    
    
    
}
