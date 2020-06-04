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
public interface QuackBehaviour {
    String quack();
}

class Quack implements QuackBehaviour 
{

    @Override
    public String quack() {
        return "Can quack";
    }
    
}

class CantQuack implements QuackBehaviour 
{

    @Override
    public String quack() {
        return "Can't quack";
    }
    
}
