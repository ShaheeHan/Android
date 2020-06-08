
package adapterpattern;

public class Adapter  implements EnemyVehicleInterface {

    private EnemyRobot enemyRobot;
    public Adapter(EnemyRobot enemyRobot)
    {
        this.enemyRobot = enemyRobot;
    }
    @Override
    public void move() {
        enemyRobot.walks();
    }

    @Override
    public void fire() {
        enemyRobot.attacksWithHands();
    }
    
}
