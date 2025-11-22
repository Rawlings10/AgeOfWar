package FactoryDesignPattern;

public abstract class Turret {
    int turretHP;
    int turretDamage;
    TurretType turretType;

    public Turret(int turretHP, int turretDamage, TurretType turretType){
        this.turretHP = turretHP;
        this.turretDamage = turretDamage;
        this.turretType = turretType;
    }

    public abstract void Repair();
    public abstract  void Attack();
}
