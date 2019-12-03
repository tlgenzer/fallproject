import mayflower.*;
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        setImage("img/Coin.png");
    }

    public void act() 
    {
        turn(4);
        if(checkTouching(Player.class))
        {
            Player.coins++;
            setLocation(-1000,5000);
        }
    }
    //This is a method to simplify the isTouching method
    public boolean checkTouching(Class a)
    {
        if(this.isTouching(a))
        {
            return true;
        }
        return false;
    }
}
