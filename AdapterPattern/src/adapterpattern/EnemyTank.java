
package adapterpattern;

public class EnemyTank implements EnemyVehicleInterface{

    @Override
    public void move() {
        System.out.println("Enemy Tank is moving towards hero");
    }

    @Override
    public void fire() {
       System.out.println("Enemy Tank is firing bullets at hero");
    }
    
}
