import mayflower.*;
public class AnimatedActor extends Actor
{
    Animation animation;
    Timer animationTimer;
    public AnimatedActor(int a )
    {
       animationTimer = new Timer(a);
    }
    public void setAnimation (Animation a)
    {
        animation = a;
    }
    public void act()
    {
        
       if(animationTimer.isDone())
        {
           
            animationTimer.reset();
            setImage(animation.getNextFrame());
        }
            
    }
    
 
}
