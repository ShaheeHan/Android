
package factorymethodpattern;

public class EnemyShipFactory {
    
    public EnemyShip makeEnemyShip(String type)
    {
        if(type.equals("o"))
        {
            return new OrdinaryEnemyShip();
        }
        else if(type.equals("b"))
        {
             return new BossEnemyShip();
            
        }
        else
            return null;
    }
    
}
