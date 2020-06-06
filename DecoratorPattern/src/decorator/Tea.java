
package decorator;

public class Tea extends Beverage {

    @Override
    public String getDescription() {
       return "Tea ";
    }

    @Override
    public int cost() {
       return 10;
    }
    
}
