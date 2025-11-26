package FactoryDesignPattern;

public abstract class ArmyFactory {

    int healthArmyHQ;
    AgeState armyType;

    public ArmyFactory(int healthArmyHQ, AgeState armyType){
        this.healthArmyHQ = healthArmyHQ;
        this.armyType = armyType;
    }

    public abstract Soldier SpawnSoldier(SoldierType type);

    public Turret createTurret(TurretType type)
    {
        int ageMultiplier = GetAgeMultiplier();    //armyType.ordinal() + 1; // armyType.ordinal() gets the index value of that enum (ex; 0 for StoneAge, 1 for Medieval, etc.) so we add 1 to avoid multiplying by 0

        switch (type) {
            case Basic:
                return new TurretType1(ageMultiplier); //since the createTurret method is called from the ArmyFactory subclass, before the turret is constructed, it will always get the ageMultiplier before passing it as a parameter to the TurretType constructor
            case Heavy:
                return new TurretType2(ageMultiplier);
            case Magic:
                return new TurretType3(ageMultiplier);
            default:
                throw new IllegalArgumentException("Unknown turret type: " + type);
        }
    }
    public int GetAgeMultiplier()
    {
        return armyType.ordinal() + 1;
    }

    public ArmyFactory EvolveArmyFactory()
    {
        int ageEnumIndex = armyType.ordinal(); // get the correct index value of the AgeState armyType enum

        if(ageEnumIndex < AgeState.values().length - 1) //-1 to avoid ArrayOutOfBounds exception --> since index starts at 0 and there are 4 enum values (the max index is 3)
        {
            ArmyFactory nextFactory;
            AgeState nextAge = AgeState.values()[ageEnumIndex + 1]; //+1 to get the next age (the .values() method returns an array of all enum values, and we use the ageEnumIndex for the current age, then +1 to get the next age)
            switch (nextAge) 
            {
                case StoneAge:
                    {
                        nextFactory = new StoneAgeFactory(500, nextAge);
                        return nextFactory;
                    }
                   
                case Medieval:
                    {
                        nextFactory = new MedievalFactory(1000, nextAge);
                        return nextFactory;
                    }
                case Modern:
                    {
                        nextFactory = new ModernFactory(1500, nextAge);
                        return nextFactory;
                    }
                case Future:
                    {
                        nextFactory = new FutureFactory(2000, nextAge);
                        return nextFactory;
                    }
                default:
                    throw new IllegalArgumentException("Cannot evolve army factory from current age: " + armyType);
            }
        }
        return this; //if already at max age, return the current factory without evolving

    }
}
