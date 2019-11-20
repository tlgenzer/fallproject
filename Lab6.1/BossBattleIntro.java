import mayflower.*;

public class BossBattleIntro extends World
{
    public BossBattleIntro() 
    {
       setBackground("images/Boss/pack.jpg");
       addObject(new Santa(), 45, 45);
       addObject(new David(), 800, 570);
       Mayflower.playMusic("sound/BossBattleIntro.mp3");
       addObject(new Heart(), 130, 130);
       addObject(new Heart(), 230, 205);
       addObject(new Heart(), 330, 280);
       addObject(new Heart(), 430, 355);
       addObject(new Heart(), 530, 430);
       addObject(new Heart(), 630, 505);
     }
     public void act()
     {
     
     }
     
    }