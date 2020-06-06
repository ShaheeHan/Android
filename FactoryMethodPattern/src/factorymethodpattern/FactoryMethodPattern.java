
package factorymethodpattern;

import java.util.Scanner;

public class FactoryMethodPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your enemy ship type(o/b): ");
        String type = sc.nextLine();
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        EnemyShip enemyShip = shipFactory.makeEnemyShip(type);
        doYourEnemyThing(enemyShip);
        
        
        
        
    }
    static void doYourEnemyThing(EnemyShip enemyShip)
    {
        enemyShip.displayEnemyShip();
        enemyShip.followHero();
        enemyShip.attackHero();
    }
}
