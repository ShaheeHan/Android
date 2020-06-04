
package strategypattern;

public class StrategyPattern {

    
    public static void main(String[] args) {
        
        Duck rubberDuck  = new RubberDuck(new CantFly(), new CantQuack());
        
        Duck WildDuck = new WildDuck(new Flys(), new Quack());
        
        System.out.println(rubberDuck.getName()+" "+rubberDuck.executeFlyBehaviour());
        System.out.println(rubberDuck.getName()+" "+rubberDuck.executeQuackBehaviour());
        
         System.out.println(WildDuck.getName()+" "+WildDuck.executeFlyBehaviour());
        System.out.println(WildDuck.getName()+" "+WildDuck.executeQuackBehaviour());
        
        rubberDuck.setQuackBehaviour(new Quack());
        System.out.println(rubberDuck.getName()+" "+rubberDuck.executeQuackBehaviour());
        
    }
    
}
