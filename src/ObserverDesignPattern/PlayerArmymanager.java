package ObserverDesignPattern;

import FactoryDesignPattern.ManagerArmyFactory;

public class PlayerArmymanager extends ArmyManager{

    public PlayerArmymanager(ManagerArmyFactory factory, int HP){
        super(factory, HP);
    }

    @Override
    public void update(String eventMessage) {
        System.out.println("[PLAYER ARMY] Event: " + eventMessage);

        if (eventMessage.equals("ENEMY_ATTACK")) {
            HP -= 10;
        }
    }
}
