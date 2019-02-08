

public class GumballMachine {
 
    State soldOutState;
    State noSufficientCoinState;
    State hasSufficientCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int coin_value;
    int machine;  
 
    public GumballMachine(int numberGumballs,int machine) {
        soldOutState = new SoldOutState(this);
        noSufficientCoinState = new NoSufficientCoinState(this);
        hasSufficientCoinState = new HasSufficientCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noSufficientCoinState;
        } 
    }
 
    public void insertCoin() {
        state.insertCoin();
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

    public State getNoQuarterState() {
        return noSufficientCoinState;
    }

    public State getHasQuarterState() {
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
