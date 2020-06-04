/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Tanzim
 */
public interface FlyBehaviour {
    String fly();
}

class Flys implements FlyBehaviour
{
    @Override
    public String fly()
    {
        return "Flying High...";
    }
}

class CantFly implements FlyBehaviour
{

    @Override
    public String fly() 
    {  
        return "Can't Fly";
    }    
}