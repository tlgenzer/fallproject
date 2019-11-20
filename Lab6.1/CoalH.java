import mayflower.*; //tell Java we will be using the Mayflower API

public class CoalH extends Coal
{
    private int velocity;
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public CoalH() 
    {
      setImage("images/CoalH.png");
      velocity=4;
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      if(isTouching(Wall.class)||isTouching(WallV.class)||isTouching(Wall3.class)||isTouching(BlueWall.class)||isTouching(BlueWall3.class)||isTouching(BlueWallVert.class))
      {
        velocity*=-1;   
      }
      setLocation(getX()+velocity, getY());
    }
}