/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Tanzim
 */

public class Soy extends Decorator{

    Beverage beverage;
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        
        return beverage.getDescription() + "Soy " ;
    }

    @Override
    public int cost() {
       return beverage.cost()+ 40;
    }
    
}
