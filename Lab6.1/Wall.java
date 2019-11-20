import mayflower.*; //tell Java we will be using the Mayflower API

public class Wall extends Actor
{
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Wall() 
    {
      setImage("images/wall.jpg");
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      
    }
}