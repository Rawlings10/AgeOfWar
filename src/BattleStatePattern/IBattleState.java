package BattleStatePattern;

public interface IBattleState 
{
    void EnterState(Soldier soldier);
    void WhileInState(Soldier soldier);
    void ExitState(Soldier soldier);
    void GetCurrentBattleState(Soldier soldier);
}