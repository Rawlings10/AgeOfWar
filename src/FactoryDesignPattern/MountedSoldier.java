package FactoryDesignPattern;

public class MountedSoldier extends Soldier{

    //make a variable call ageMultiplier in the age state design pattern and assign it here so it multiplies the current age state
    public MountedSoldier(int ageMultiplier){
        this.soldierHP = 50 * ageMultiplier;
        this.damagePts = 5 * ageMultiplier;
        this.soldierType = SoldierType.Mounted;
    }

    @Override
    public void Attack() {
        System.out.println(SoldierType.Mounted + "soldier attack, Damage: -" +damagePts);
    }

    @Override
    public void Die() {
        System.out.println(SoldierType.Mounted + " soldier is dead");
    }
}
