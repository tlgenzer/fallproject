
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
    String[] walkRarr = new String[10];
    Animation walkR;
    Animation walkL;
    int fps = 33333333;
    
    public Enemy(int min, int max)
    {
        super(33333333);
        min = min;
        max = max;
        for(int i = 0; i < 8; i++)
        {
            walkRarr[i] = "img/dog/Run (" + (i+1) + ").png";
            
            

        }
        walkR = new Animation(fps,walkRarr,false);
        walkL= new Animation(fps,walkRarr,true);
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
            setAnimation(walkR);
        }
        else if(getX()<max)
        {
            
            setLocation( getX()+1, getY() );
            setAnimation(walkL);
        }
    }
}
