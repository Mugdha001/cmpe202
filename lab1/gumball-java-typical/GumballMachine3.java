
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3 extends Main
{
    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine3( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int[] coin)
    {
        int sum=0;
        for(int i=0; i<coin.length; i++){
            sum= sum+coin[i];
        }
        if ( sum == 50 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin/s." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert the right denomination of coins" ) ;
    	}        
    }
}
