package FactoryDesignPattern;

public class MedievalFactory extends ArmyFactory{

    public MedievalFactory(int healthArmyHQ) 
    {
        super(healthArmyHQ, AgeState.Medieval); 
    }

    @Override
    public Soldier SpawnSoldier(SoldierType type) 
    {
        switch (type){
            case Infantry:
                //we would call something like return InfantrySoldier(AgeState.Medieval) or InfantrySoldier(armyType) to spawn the infantry soldier type for this specific age of ArmyFactory.
                return null; //add the soilder type
            case Ranged:
                return null; //add the soilder type
            case Mounted:
                return null; //add the soilder type
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
