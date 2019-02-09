

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(3,2);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(5);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(5);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
