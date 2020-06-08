package adapterpattern;

public class AdapterPattern {
    public static void main(String[] args) {

        EnemyVehicleInterface enemyTank  = new EnemyTank();
        enemyTank.move();
        enemyTank.fire();
        System.out.println("");
        
        EnemyVehicleInterface enemyJeep  = new EnemyJeep();
        enemyJeep.move();
        enemyJeep.fire();
        System.out.println("");
        
        //doing the enemy stuff with adapter
        EnemyRobot enemyRobot = new EnemyRobot();
        Adapter adapter = new Adapter(enemyRobot);
        adapter.move();
        adapter.fire();
        
        
        
        
        
        
    }
    
}
