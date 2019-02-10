
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_nickel;
    private boolean has_dime;
    private int coin_value;
    private int machine;   

    public GumballMachine(int size, int machine_no)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.has_dime = false;
        this.has_nickel = false;
        this.machine = machine_no;       
        
    }

    public void insertCoin(int coin)
    { switch(coin){
        case 25: this.has_quarter = true;
                 this.coin_value = this.coin_value + 25;
                 break;
        case 10: this.has_dime =true;
                 this.coin_value = this.coin_value + 10;
                 break;
        case 5:  this.has_nickel =true;
                 this.coin_value = this.coin_value + 5;
                 break;
        default: //System.out.println("Coin denomination not accepted. Insert a valid denomination.");
                 break;
    }        
    }  
    
    public void turnCrank()
    {   
        switch(machine){
        
        case 1:
        if(this.has_quarter){
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }  
        break;
        case 2:
        if(this.has_quarter && this.coin_value>=50){
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
                this.coin_value=0;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else 
        {
                System.out.println( "Please insert a quarter" ) ;
                System.out.println( "Current Money in gumball is "+this.coin_value+" cents" ) ;
            
        }  
        break;
        case 3:
         if(this.coin_value>=50){
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.has_nickel = false;
                this.has_dime = false;
                System.out.println( "Thanks for your coin/s.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin/s." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert more coins." ) ;
            System.out.println( "Current Money in gumball is "+this.coin_value+" cents" ) ;
            System.out.println( "Please insert more coins to make it 50 cents." ) ;
        }  
        break;
        default: System.out.println("We currently have only 3 machines. Select the right machine");
                 break;
    } 
               
    }
}
