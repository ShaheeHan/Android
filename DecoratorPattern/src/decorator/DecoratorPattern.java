
package decorator;

public class DecoratorPattern {

    
    public static void main(String[] args) {
        
        Beverage beverage = new Espresso();
        System.out.println("Type: "+beverage.getDescription() +"\nCost : "+beverage.cost()+"TK");
        System.out.println();
        Beverage mixedbeverage = new Tea();
        mixedbeverage = new Soy(mixedbeverage);
        mixedbeverage = new Whip(mixedbeverage);
        System.out.println("Type: "+mixedbeverage.getDescription() +"\nCost : "+mixedbeverage.cost()+"TK");
        
        System.out.println();
        Beverage mixedbeverage2 = new Soy(new Whip(new Espresso()));
        System.out.println("Type: "+mixedbeverage2.getDescription() +"\nCost : "+mixedbeverage2.cost()+"TK");
        
    }
    
}
