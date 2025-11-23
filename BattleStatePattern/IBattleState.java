package BattleStatePattern;

public interface IBattleState 
{
    void EnterState();
    void WhileInState();
    void ExitState();
    void GetCurrentBattleState();
}