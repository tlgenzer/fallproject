import mayflower.*;

public class BossBattle extends World
{
    public BossBattle() 
    {
     setBackground("images/Boss/BossBattle.jpg");
     addObject(new Santa(), 45, 45);
     addObject(new DavidWin(), 800, 570);
     Mayflower.stopMusic("sound/BossBattleIntro.mp3");
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
     addObject(new CoalH(), 350, 350);
     //addObject(new Coal(), 650, 100);
     addObject(new Coal(), 750, 100);
     addObject(new Grinch(), 550, 520);
     //LIVES
     addObject(new Heart(), 800, 100);
     addObject(new Heart(), 700, 100);
     addObject(new Heart(), 600, 100);
     addObject(new Heart(), 500, 100);
     addObject(new Heart(), 400, 100);
     addObject(new Heart(), 300, 100);
     addObject(new Heart(), 200, 100);
     Mayflower.playMusic("sound/Nic.mp3");
     }
  
    public void act()
    {
    }
}