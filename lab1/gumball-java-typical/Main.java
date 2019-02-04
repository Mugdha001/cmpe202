

public class Main {

    public static void main(String[] args) {
        GumballMachine1 gumballMachine1 = new GumballMachine1(6);
        GumballMachine2 gumballMachine2 = new GumballMachine2(5);
        GumballMachine3 gumballMachine3 = new GumballMachine3(7);
        //System.out.println(gumballMachine);

        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        gumballMachine2.insertQuarter( 25 , 25);
        gumballMachine2.turnCrank();
        int []arr = new int[3];
        arr[0]=10;
        arr[1]=10;
        arr[2]=30;
        gumballMachine3.insertQuarter(arr);
        gumballMachine3.turnCrank();

        //System.out.println(gumballMachine);

        //gumballMachine1.insertQuarter( 15 );
        //gumballMachine1.turnCrank();
        //gumballMachine.insertQuarter( 35 );
        //gumballMachine.turnCrank();

		//System.out.println(gumballMachine);
	}
}
