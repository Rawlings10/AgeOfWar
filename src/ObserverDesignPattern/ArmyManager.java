package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

import FactoryDesignPattern.ManagerArmyFactory;
import FactoryDesignPattern.Soldier;
import FactoryDesignPattern.Turret;

import java.util.ArrayList;

public abstract class ArmyManager implements Observer{

    protected Soldier[] spawnedPlayerSoldiers;
    protected int HP;
    protected ManagerArmyFactory factory;
    protected Turret[] turret;

    public ArmyManager(ManagerArmyFactory factory, int HP, int armySize, int turretSlots){
        this.factory = factory;
        this.HP = HP;
        this.spawnedPlayerSoldiers = new Soldier[armySize];
        this.turret = new Turret[turretSlots];
    }

    @Override
    public abstract void update(String eventMessage);

}
