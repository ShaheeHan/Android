
package templatepattern;

public class TemplatePattern {

    
    public static void main(String[] args) {
        
        Beverage tea = new MakeTea();
        Beverage coffee = new MakeCoffee();
        
        System.out.println("\nMaking tea...");
        tea.recipe();
        System.out.println();
        System.out.println("\nMaking coffee...");
        coffee.recipe();
        
        
        
        
        
    }
    
}
