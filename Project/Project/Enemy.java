
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends AnimatedActor
{
    // instance variables - replace the example below with your own
    int min;
    int max;
    public Enemy(int min, int max)
    {
        super(33333333);
        min = min;
        max = max;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        if(getX()>min)
        {
            setLocation( getX()+1, getY() );
        }
        else if(getX()<max)
        {
            
            setLocation( getX()+1, getY() );
        }
    }
}
