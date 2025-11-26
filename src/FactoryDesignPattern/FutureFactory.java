package FactoryDesignPattern;

public class FutureFactory extends ManagerArmyFactory {

    public FutureFactory(int healthArmyHQ) {super(healthArmyHQ, AgeState.Future); }

    @Override
    public Soldier SpawnSoldier(SoldierType type) {
        switch (type){
            case Infantry:
                return new InfantrySoldier(1); //we would change this variable later when we do the state
            case Ranged:
                return new RangedSoldier(1); //we would change this variable later when we do the state
            case Mounted:
                return new MountedSoldier(1); //we would change this variable later when we do the state
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
