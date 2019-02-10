

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(3,3);
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin(5);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin(10);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		
		GumballMachine gumballMachine2 = new GumballMachine(3,2);
		System.out.println(gumballMachine2);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);
		
		GumballMachine gumballMachine3 = new GumballMachine(3,1);
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
	}
}
