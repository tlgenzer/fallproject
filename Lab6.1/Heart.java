import mayflower.*; //tell Java we will be using the Mayflower API

public class Heart extends Actor
{
    private int count;
    private int frame;
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Heart() 
    {
      setImage("images/Heart/heart1.png");
      count=0;
      frame=1;
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
 {
      if(isTouching(Santa.class))
      {
        setLocation( getX(), getY()+2000 );
      }
      turn(1);
      //Animation
    count++;
    if(count>=8)
    {
    count=0;
    frame+=1;
    }
    if(frame>=6)
    {
    frame=1;
    }
    checkFrame();
    }
    public void checkFrame()
    {
    setImage("images/Heart/heart"+frame+".png");
    }
}