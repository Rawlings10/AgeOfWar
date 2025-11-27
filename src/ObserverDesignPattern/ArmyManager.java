package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

import FactoryDesignPattern.ManagerArmyFactory;
import FactoryDesignPattern.Soldier;

import java.util.ArrayList;

public abstract class ArmyManager implements Observer{

    protected Soldier[] spawnedPlayerSoldiers;
    protected int HP;
    protected ManagerArmyFactory factory;

    public ArmyManager(ManagerArmyFactory factory, int HP){
        this.factory = factory;
        this.HP = HP;
    }

    @Override
    public abstract void update(String eventMessage);

}
