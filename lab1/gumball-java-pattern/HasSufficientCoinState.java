

import java.util.Random;

public class HasSufficientCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasSufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin_in) {
        System.out.println("You can't insert another coin");
    }
 
    public void ejectCoin() {
        System.out.println("coins returned");
        gumballMachine.setState(gumballMachine.getNoSufficientCoinState());
        System.out.println("Ejecting "+gumballMachine.getCoinValue()+" cents");
        gumballMachine.resetCoinValue(0);
        
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.ejectCoin();
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
