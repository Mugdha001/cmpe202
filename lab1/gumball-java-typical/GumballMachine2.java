
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine2 extends Main
{
    
    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin1, int coin2)
    {
        if ( coin1 == 25 && coin2 == 25)
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
    			System.out.println( "Thanks for your 2 quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin/s." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert 2 coins of a quarter each" ) ;
    	}        
    }
}
