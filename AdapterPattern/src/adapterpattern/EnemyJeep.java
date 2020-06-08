
package adapterpattern;


public class EnemyJeep implements EnemyVehicleInterface{

    @Override
    public void move() {
        System.out.println("Enemy Jeep is moving towards hero");
    }

    @Override
    public void fire() {
       System.out.println("Enemy Jeep is firing bullets at hero");
    }
    
}
