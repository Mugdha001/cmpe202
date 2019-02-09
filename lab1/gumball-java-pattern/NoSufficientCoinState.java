

public class NoSufficientCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoSufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin_in) {
        System.out.println("Inserting coin");
        int machinetype = gumballMachine.getMachineType();
        boolean checkCoinCompatibility= false;
            switch(machinetype)
        {
            case 1 : checkCoinCompatibility = (coin_in==25); break;
            case 2 : checkCoinCompatibility = (coin_in==25); break;
            case 3 : checkCoinCompatibility = (coin_in==25 || coin_in ==5 || coin_in ==10); break;
        }
        if(checkCoinCompatibility){
            gumballMachine.setCoinValue(coin_in);
            if( gumballMachine.getCoinValue() >= gumballMachine.getGumballValue() )         
            gumballMachine.setState(gumballMachine.getHasSufficientCoinState());
        }
        
        else
            if(gumballMachine.getCoinValue() > 0)
		{
			System.out.println("Ejecting "+gumballMachine.getCoinValue()+" cents");
			gumballMachine.resetCoinValue(0);
		}
    }
    
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
 
	public void turnCrank() {
		System.out.println("You turned, but coin value is insufficient");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
