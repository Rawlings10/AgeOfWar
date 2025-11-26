package BattleStatePattern;

public IBattleState Idle implements IBattleState 
{
   

    @Override
    public void GetCurrentBattleState(Soldier soldier) 
    {
        System.out.println("The unit is idle... waiting for orders.");
        this.soldierState = Idle;
    }

    @Override
    public void EnterState(Soldier soldier) 
    {
        System.out.println("Entering Idle State");
        //get and set all the relevent variables and parameters for attacking in the soldier
        //e.g. set attack animation, set attack damage, set attack speed, set targetDestination, etc
    }

    @Override
    public void WhileInState(Soldier soldier) 
    {
        System.out.println("While In Idle State, perform...");// --> stop movement, play idle animation, search for enemies or new orders (like state update --> players can still be killed while idle, by longer range opponents/turrets)
        //continuously check if the unit is still attacking
        //if the target is dead or out of range, change state to idle or dead respectively
        //else continue attacking and updating the targetDestination and other relevent variables

    }

    @Override
    public void ExitState(Soldier soldier) 
    {
        System.out.println("Exiting Idle State");
        //clean up any variables or parameters set during the attacking state
        //e.g. reset attack animation, reset attack damage, reset attack speed, etc
        //if killed during attack, change state to dead
        //...else change state to idle
    }
}