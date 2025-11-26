package FactoryDesignPattern;

public class TurretType2 extends Turret{

    private static final int BASE_TURRET_HP = 75;
    private static final int BASE_TURRET_DAMAGE = 10;

    public TurretType2() 
    {
        super(BASE_TURRET_HP * ageMultiplier, BASE_TURRET_DAMAGE * ageMultiplier, TurretType.Heavy);
    }

    @Override
    public void Attack() {

    }

    @Override
    public void Repair() {

    }

}
