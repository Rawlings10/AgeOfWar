package FactoryDesignPattern;

public class InfantrySoldier extends Soldier{

    private int damagePts = 5;
    //make a variable call ageMultiplier in the age state design pattern and assign it here so it multiplies the current age state
    public InfantrySoldier(int ageMultiplier){
        this.soldierHP = 100 * ageMultiplier;
        this.damagePts = damagePts * ageMultiplier;
        this.soldierType = SoldierType.Ranged;
    }

    @Override
    public void Attack() {
        System.out.println(SoldierType.Infantry + "soldier attack, Damage: -" +damagePts);
    }

    @Override
    public void Die() {
        System.out.println(SoldierType.Infantry + " soldier is dead");
    }
}
