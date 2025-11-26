package FactoryDesignPattern;

public class TurretType1 extends Turret{

    private static final int BASE_TURRET_HP = 50;
    private static final int BASE_TURRET_DAMAGE = 5;

    public TurretType1() 
    {
        super(BASE_TURRET_HP * ageMultiplier, BASE_TURRET_DAMAGE * ageMultiplier, TurretType.Basic);
    }

    @Override
    public void Attack() 
    {

    }

    @Override
    public void Repair() 
    {

    }
}
