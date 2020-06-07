
package templatepattern;

public abstract class Beverage {
    
    public final void  recipe()
    {
        boilWater();
        brew();
        pour();
        if(customerWantsCondiments())
        {
            addCondiments();
        }
       
        
    }
    
    void boilWater()
    {
        System.out.println("Boiling water");
    }
    
    void pour()
    {
         System.out.println("Pouring into the cup");
    }
    boolean customerWantsCondiments()
    {
        return true;
    }
    
    abstract void brew();
    abstract void addCondiments();
    
}
