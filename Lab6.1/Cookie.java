import mayflower.*; //tell Java we will be using the Mayflower API

public class Cookie extends Actor
{
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Cookie() 
    {
      setImage("images/cookie.png");
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
 {
      if(isTouching(Santa.class))
      {
        setLocation( 2000, 2000);
        Mayflower.playSound("sound/Cookie.wav");
      }
      turn(1);
    }
}