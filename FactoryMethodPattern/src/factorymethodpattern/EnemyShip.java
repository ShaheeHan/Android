/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpattern;

import java.util.Random;

public abstract class EnemyShip  {
    private int speed;
    private String name;
    private int damage;
    
    public EnemyShip()
    {
        Random rand = new Random();
        this.name = "enemy-"+rand.nextInt(100);
        
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getDamage()
    {
        return damage;
    }
    public String getName()
    {
        return name;
    }
    
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void followHero()
    {
        System.out.println(getName() + " is following the hero at "+getSpeed());
    }
    
    public void displayEnemyShip()
    {
        System.out.println(getName() + " is on the screen");
    }
    public void attackHero()
    {
         System.out.println(getName() + " is attacked hero and damage is "+getDamage());
    }

}
