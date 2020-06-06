package decorator;


public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso ";
    }

    @Override
    public int cost() {
        return 50;
    }
    
}
