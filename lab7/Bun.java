/**
* New Class - Bun
*/

public class Bun extends LeafDecorator
{
    private String[] options ;
       
    public Bun( String d )
    {
        super(d) ;
    }
    
    //Extra costs for some bun types
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Gluten-Free Bun".equals(options[i]) ) 
                    this.price += 1.00  ;
            else if("Pretzel Bun".equals(options[i]))
                    this.price += 0.50;
            else if("Hawaiian Bun".equals(options[i]))
                    this.price += 1.00 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }

 
}