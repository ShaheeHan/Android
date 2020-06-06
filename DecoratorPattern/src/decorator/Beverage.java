
package decorator;

public abstract class Beverage {
    private String description = null;
    public  String getDescription(){
        return description;
    }
    public abstract int cost();
}
