package FactoryDesignPattern;

public class MedievalFactory extends ArmyFactory{

    public MedievalFactory(int healthArmyHQ) {super(healthArmyHQ, AgeState.Medieval); }

    @Override
    public Soldier SpawnSoldier(SoldierType type) {
        switch (type){
            case Infantry:
                return null; //add the soilder type
            case Ranged:
                return null; //add the soilder type
            case Mounted:
                return null; //add the soilder type
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
