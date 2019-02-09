

public class GumballMachine {
 
    State soldOutState;
    State noSufficientCoinState;
    State hasSufficientCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int coin_value=0;
    int machine=0;
    int gumball_value = 0;
   
 
    public GumballMachine(int numberGumballs,int machine_type) {
        soldOutState = new SoldOutState(this);
        noSufficientCoinState = new NoSufficientCoinState(this);
        hasSufficientCoinState = new HasSufficientCoinState(this);
        soldState = new SoldState(this);
        this.coin_value = 0;
	this.machine = machine_type;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noSufficientCoinState;
        } 
        switch(machine_type)
		{
			case 1 : gumball_value = 25; break;
			case 2 : gumball_value = 50; break;
			case 3 : gumball_value = 50; break;
			default : System.out.println("Sorry no machine found with given input type");
		}
       
    }
     
    public int getCoinValue(){
		return this.coin_value;
	}

    public void setCoinValue(int value){
		this.coin_value+=value;
    }
    
    public void resetCoinValue(int value){
		this.coin_value=value;
    }
    
     public int getMachineType(){
		return this.machine;
    }

    public int getGumballValue(){
		return this.gumball_value;
    }
      
	
    public void insertCoin(int coin_in) {
        state.insertCoin(coin_in);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noSufficientCoinState;
	}
	
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoSufficientCoinState() {
        return noSufficientCoinState;
    }

    public State getHasSufficientCoinState() {
        return hasSufficientCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
