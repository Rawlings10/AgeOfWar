package FactoryDesignPattern;

public class MedievalFactory extends ManagerArmyFactory {

    public MedievalFactory(int healthArmyHQ) {super(healthArmyHQ, AgeState.Medieval); }

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
