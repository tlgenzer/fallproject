import mayflower.*; //tell Java we will be using the Mayflower API

public class Star extends Actor
{
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    int level;
    int c;
    public Star(int lvl,int coin) 
    {
      setImage("img/star.png");
      level = lvl;
      c= coin;
    }
  
    //This method is called once every frame (about 60 times per second)
    public void act()
    {
      turn(2);
      if(isTouching(Player.class))
      {
          if(level==1)
          {
            World w = new Intro();
            Mayflower.setWorld(w);
          }
          if(level==2)
          {
            World w = new Win(c);
            Mayflower.setWorld(w);
          }
      }
    }
}