/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.Random;

/**
 *
 * @author Tanzim
 */
public class Duck {
    
    private String name;
    
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        Random random = new Random();
        name = "DuckQuack"+random.nextInt(20) ;
    }
    
    public void setFlyBehaviour(FlyBehaviour flyBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
    }
    
    public void setQuackBehaviour (QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }
    public String getName()
    {
        return name;
    }
    
    public String executeFlyBehaviour()
    {
        return flyBehaviour.fly();
    }
    public String executeQuackBehaviour()
    {
        return quackBehaviour.quack();
    }
    
}
