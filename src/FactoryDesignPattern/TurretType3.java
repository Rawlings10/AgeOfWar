package FactoryDesignPattern;

public class TurretType3 extends Turret{

    private static final int BASE_TURRET_HP = 100;
    private static final int BASE_TURRET_DAMAGE = 15;

    public TurretType3() 
    {
        super(BASE_TURRET_HP * ageMultiplier, BASE_TURRET_DAMAGE * ageMultiplier, TurretType.Magic);
    }

    @Override
    public void Attack() {

    }

    @Override
    public void Repair() {

    }

}
