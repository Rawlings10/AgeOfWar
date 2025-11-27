package ObserverDesignPattern;

import FactoryDesignPattern.ManagerArmyFactory;

public class EnemyArmymanager extends ArmyManager{

    public EnemyArmymanager(ManagerArmyFactory factory, int HP){
        super(factory, HP);
    }

    @Override
    public void update(String eventMessage) {
        System.out.println("[ENEMY ARMY] Event: " + eventMessage);

        if (eventMessage.equals("PLAYER_ATTACK")) {
            HP -= 10;
        }
    }
}
