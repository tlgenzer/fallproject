import mayflower.*; //tell Java we will be using the Mayflower API

public class Flag extends Actor
{
    private int playFlag = 0;   
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Flag() 
    {
      setImage("images/Flag.png");
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      int oldX = getX();
      int oldY = getY();
      
      if(isTouching(Santa.class))
      {
        setLocation( getX(), getY()+1 );
        playFlag++;
          
      }
      
      if(oldY>650)
      {
        setLocation( 1000, 1000 );
        
          
      }
      if(playFlag==1)
      {
       Mayflower.playMusic("sound/MarioWin.mp3"); 
        
      }
    }
}