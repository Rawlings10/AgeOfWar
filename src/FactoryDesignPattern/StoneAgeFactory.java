package FactoryDesignPattern;

public class StoneAgeFactory extends ArmyFactory{

    public StoneAgeFactory(int healthArmyHQ) {super(healthArmyHQ, AgeState.StoneAge); }

    @Override
    public Soldier SpawnSoldier(SoldierType type) {
        switch (type){
            case Infantry:
                return null; //add the soldier type
            case Ranged:
                return null; //add the soldier type
            case Mounted:
                return null; //add the soldier type
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
