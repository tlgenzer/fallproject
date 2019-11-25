
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends AnimatedActor
{
    // instance variables - replace the example below with your own
    public int min;
    public int max;
    String[] walkRarr = new String[8];
    Animation walkR;
    Animation walkL;
    int fps = 33333333;
    double acceleration = 1;
    int direction = 1;
    public Enemy(int x1, int x2)
    {
        super(33333333);
        min = x1;
        max = x2;
        for(int i = 0; i < 8; i++)
        {
            walkRarr[i] = "img/dog/Run (" + (i+1) + ").png";

        }
        walkR = new Animation(fps,walkRarr,false);
        walkL= new Animation(fps,walkRarr,true);
        setAnimation(walkR);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        super.act();
        getWorld().showText("Min: " + "[" + min + "]" + ", Max: " + "[" + max + "]" + ", D:" + "[" 
            + direction + "]", 10, 90);
        if(getX()<min || getX()>max)
        {
            // setLocation( getX()+direction, getY() );
            // setAnimation(walkR);

            direction*=-1;
        }
        if(direction==1)setAnimation(walkR);
        if(direction==-1)setAnimation(walkL);
        //direction=direction*-1;
        setLocation( getX()+direction, getY() );
        //setAnimation(walkL);
        gravity();
        System.out.println(getX());
    }
    public void gravity()
    {
        if(isTouching(Block.class))
        {
            acceleration=1;
        } 
        if(!isTouching(Block.class))
        {
            setLocation(getX(),getY()+acceleration*1.2 );
            if(acceleration<9.8)
            {

                acceleration= acceleration*1.05;
            }
        }

    }
}
