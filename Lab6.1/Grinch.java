import mayflower.*; //tell Java we will be using the Mayflower API

public class Grinch extends Actor
{
    private int velocity;
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Grinch() 
    {
      setImage("images/Grinch.png");
      velocity=3;
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      //Movement
      if(isTouching(Wall3.class)||(isTouching(WallV.class)||(isTouching(BlueWallVert.class))||(isTouching(BlueWall3.class))))
      {
        velocity*=-1;   
      }
      setLocation(getX()+velocity, getY());
    }
}