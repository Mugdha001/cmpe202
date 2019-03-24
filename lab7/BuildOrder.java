  

public class BuildOrder {

    public static Component getOrder()
    {


        Composite order = new Composite( "Order" ) ;

        /** Order #1 **/
        CustomBurger customBurger_1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b_1 = new Burger( "Burger Options" ) ;
        String[] bo_1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b_1.setOptions( bo_1 ) ;


        // 1 cheese free, extra cheese +1.00
        Cheese c_1 = new Cheese( "Cheese Options" ) ;
        String[] co_1 = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c_1.setOptions( co_1 ) ;
        c_1.wrapDecorator( b_1 ) ;

        PremiumCheese cp_1 = new PremiumCheese("Premium Cheese Options");
        String[] cop_1 = { "Danish Blue Cheese" };
        cp_1.setOptions(cop_1);
        cp_1.wrapDecorator(c_1);


        Sauce s_1 = new Sauce( "Sauce Options" ) ;
        String[] so_1 = {  "Mayonnaise", "Thai Peanut Sauce"  } ;
        s_1.setOptions( so_1 ) ;
        s_1.wrapDecorator( cp_1 ) ;

        // 4 toppings free, extra +.75
        Toppings t_1 = new Toppings( "Toppings Options" ) ;
        String[] to_1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t_1.setOptions( to_1 ) ;
        t_1.wrapDecorator( s_1 ) ;


        // premium topping +1.50
        ToppingsPremium tp_1 = new ToppingsPremium( "Premium Options" ) ;
        String[] tpo_1 = { "Marinated Tomatoes" } ;
        tp_1.setOptions( tpo_1 ) ;
        tp_1.wrapDecorator( t_1) ;
        

        Bun bun_1 = new Bun( "Bun Options" ) ;
        String[] bun_o_1 = { "Ciabatta (Vegan)" } ;
        bun_1.setOptions( bun_o_1 ) ;
        bun_1.wrapDecorator( tp_1 ) ;
       

        Sides sides_1 = new Sides( "Side Options" ) ;
        String[] sides_1_options = { "Shoestring Fries" } ;
        sides_1.setOptions( sides_1_options ) ;
        sides_1.wrapDecorator( bun_1) ;
        
        // Setup Custom Burger Ingredients
        customBurger_1.setDecorator( sides_1 ) ;
        customBurger_1.addChild( b_1 ) ; //burger
        customBurger_1.addChild( c_1 ) ; //cheese
        customBurger_1.addChild( cp_1 ); //premium cheese
        customBurger_1.addChild( s_1 ) ; //sauce
        customBurger_1.addChild( t_1 ) ; //toppings
        customBurger_1.addChild( tp_1 ) ; //premium toppings
        customBurger_1.addChild( bun_1 ) ; //bun
        customBurger_1.addChild( sides_1 ) ; //sides

        

        /** Order #2 **/

        CustomBurger customBurger_2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b_2 = new Burger( "Burger Options" ) ;
        String[] bo_2 = { "Hormone & AntiBiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b_2.setOptions( bo_2 ) ;


        // 1 cheese free, extra cheese +1.00
        Cheese c_2 = new Cheese( "Cheese Options" ) ;
        String[] co_2 = { "Smoked Gouda", "Greek Feta" } ;
        c_2.setOptions( co_2 ) ;
        c_2.wrapDecorator( b_2 ) ;

        PremiumCheese cp_2 = new PremiumCheese("Premium Cheese Options");
        String[] cop_2 = { "Fresh Mozzarella" } ;
        cp_2.setOptions(cop_2);
        cp_2.wrapDecorator(c_2);


        Sauce s_2 = new Sauce( "Sauce Options" ) ;
        String[] so_2 =  { "Habanero Salsa" } ;
        s_2.setOptions( so_2 ) ;
        s_2.wrapDecorator( cp_2 ) ;

        // 4 toppings free, extra +.75
        Toppings t_2 = new Toppings( "Toppings Options" ) ;
        String[] to_2 =  { "Crushed Peanuts"} ;
        t_2.setOptions( to_2 ) ;
        t_2.wrapDecorator( s_2 ) ;


        // premium topping +1.50
        ToppingsPremium tp_2 = new ToppingsPremium( "Premium Options" ) ;
        String[] tpo_2 = { "Sunny Side Up Egg*", "Marinated Tomatoes"  } ;
        tp_2.setOptions( tpo_2 ) ;
        tp_2.wrapDecorator( t_2 ) ;
        

        Bun bun_2 = new Bun( "Bun Options" ) ;
        String[] bun_o_2 = { "Gluten-Free Bun" } ;
        bun_2.setOptions( bun_o_2 ) ;
        bun_2.wrapDecorator( tp_2 ) ;
       

        Sides sides_2 = new Sides( "Side Options" ) ;
        String[] sides_2_options = { "Shoestring Fries" } ;
        sides_2.setOptions( sides_2_options ) ;
        sides_2.wrapDecorator( bun_2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger_2.setDecorator( sides_2 ) ;
        customBurger_2.addChild( b_2 ) ; //burger
        customBurger_2.addChild( c_2 ) ; //cheese
        customBurger_2.addChild( cp_2 ); //premium cheese
        customBurger_2.addChild( s_2 ) ; //sauce
        customBurger_2.addChild( t_2 ) ; //toppings
        customBurger_2.addChild( tp_2 ) ; //premium toppings
        customBurger_2.addChild( bun_2 ) ; //bun
        customBurger_2.addChild( sides_2 ) ; //sides



        // Add both Custom Burgers to the Order
        order.addChild( customBurger_1 );
        order.addChild( customBurger_2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/