package FactoryDesignPattern;

public class InfantrySoldier extends Soldier{

    //make a variable call ageMultiplier in the age state design pattern and assign it here so it multiplies the current age state
    public InfantrySoldier(int ageMultiplier){
        this.soldierHP = 100 * ageMultiplier;
        this.damagePts = 5 * ageMultiplier;
        this.soldierType = SoldierType.Infantry;
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
