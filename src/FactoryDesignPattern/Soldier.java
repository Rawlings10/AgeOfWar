package FactoryDesignPattern;

public abstract class Soldier {
    protected int soldierHP;
    int damagePts;
    SoldierType soldierType;  //change soldier type in the uml class diagram to enum

    public abstract void Attack();

    public abstract void Die();

    public int getHealth() {return soldierHP; }
    public int getDamage() {return  damagePts; }
}
