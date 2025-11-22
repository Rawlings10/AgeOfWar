package FactoryDesignPattern;

public class FutureFactory extends ArmyFactory{

    public FutureFactory(int healthArmyHQ) {super(healthArmyHQ, AgeState.Future); }

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
