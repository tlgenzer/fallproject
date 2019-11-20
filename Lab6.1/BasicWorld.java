import mayflower.*;

public class BasicWorld extends World
{
    
    public BasicWorld() 
    {
     //Santa player
     addObject(new Santa(), 45, 45);
     //Background Image
     setBackground("images/background.png");
     //Background Music
     Mayflower.playMusic("sound/Pirate.mp3");
     //Builds Map Starting here
     addObject(new Tree(), 820, 590);
     //Top Walls 
     addObject(new Wall(), 0, 0);
     addObject(new Wall(), 310, 0);
     addObject(new Wall(), 620, 0);
     //left Walls
     addObject(new WallV(), 0, 31);
     addObject(new WallV(), 0, 341);
     addObject(new WallV(), 0, 651);
     //Bottom Walls
     addObject(new Wall(), 0, 680);
     addObject(new Wall(), 310, 680);
     addObject(new Wall(), 620, 680);
     //Right Walls
     addObject(new WallV(), 888, 31);
     addObject(new WallV(), 888, 341);
     addObject(new WallV(), 888, 651);
     //Middle Walls
     addObject(new Wall3(), 461, 31);
     addObject(new Wall3(), 461, 494);
     //Middle Left Walls
     addObject(new WallV(), 231, 184);
     addObject(new WallV(), 692, 184);
     //Bad Guys
     addObject(new Coal(), 550, 577);
     addObject(new Coal(), 350, 100);
     addObject(new Grinch(), 550, 520);
     //Life heart objects
     addObject(new Heart(), 800, 100);
     }
  
    public void act()
    {
    }
}