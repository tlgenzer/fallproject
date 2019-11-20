import mayflower.*;

public class Win extends World
{
    public Win() 
    {
      //Sets background of scene
      setBackground("images/WinPole.png");
      //Places Santa player
      addObject(new Santa(), 45, 45);
      addObject(new Flag(), 300, 260);
      //Stops Background music and Plays Win Sound
      Mayflower.stopMusic("sound/Nic.mp3");
      
     }
     public void act()
     {
     
     }
     
    }