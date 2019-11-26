import mayflower.*; //tell Java we will be using the Mayflower API

public class Star extends Actor
{
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Star() 
    {
      setImage("img/star.png");
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      turn(2);
    }
}