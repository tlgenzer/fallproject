import mayflower.*;

public class GameOver extends World
{
    public GameOver() 
    {
     setBackground("img/gameover.png");
     //Stops all Music
     Mayflower.stopMusic("sound/Pirate.mp3");
     Mayflower.stopMusic("sound/gamer.mp3");
     Mayflower.stopMusic("sound/town.mp3");
     Mayflower.stopMusic("sound/BossBattleIntro.mp3");
     Mayflower.stopMusic("sound/MarioWin.mp3");
     Mayflower.stopMusic("sound/Nic.mp3");
     Mayflower.stopMusic("sound/Win.mp3");
     Mayflower.stopMusic("sound/Win.mp3");
     //Play GameOver Music
     Mayflower.playMusic("sound/GameOver128.mp3");
     }
  
    public void act()
    {
      //My attempt to make a reset key...
      // if(Mayflower.isKeyDown( Keyboard.KEY_R ))
      // {
           // //Mayflower.stopMusic("Pirate.wav");
           // //Mayflower.setWorld(new BasicWorld()); 
           // //Runner run = new Runner(); 
      // }
      
      
      
    }
}