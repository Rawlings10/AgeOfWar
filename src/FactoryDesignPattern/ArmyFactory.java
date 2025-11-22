package FactoryDesignPattern;

public abstract class ArmyFactory {

    int healthArmyHQ;
    AgeState armyType;

    public ArmyFactory(int healthArmyHQ, AgeState armyType){
        this.healthArmyHQ = healthArmyHQ;
        this.armyType = armyType;
    }

    public abstract Soldier SpawnSoldier(SoldierType type);

    public Turret createTurret(TurretType type){
        switch (type) {
            case Basic:
                return new TurretType1();
            case Heavy:
                return new TurretType2();
            case Magic:
                return new TurretType3();
            default:
                throw new IllegalArgumentException("Unknown turret type: " + type);
        }
    }
}
