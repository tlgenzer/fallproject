import mayflower.*;
public class Player extends AnimatedActor
{
    String[] img = new String[10];
    int fps = 33333333;
    Animation idle;
    public double speed = 2;
    public Player()
    {
        super(33333333);
        for(int i = 0; i < 10; i++)
        {
            img[i] = "img/ninjagirl/Idle" + (i) + ".png";
            
        }
        idle = new Animation(fps, img);
        setAnimation(idle);
    }
public void act()
{
    super.act();
    if(Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
      {
        setLocation( getX()-speed, getY() );
        
      }
      
      if(Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
      {
        setLocation( getX()+speed, getY() );
        
      }
      
      if(Mayflower.isKeyDown( Keyboard.KEY_UP ))
      {
        setLocation( getX(), getY()-speed );
        
      }
      
      if(Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
      {
        setLocation( getX(), getY()+speed );
        
      }
}

}
