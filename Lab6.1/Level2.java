import mayflower.*;

public class Level2 extends World
{
    public Level2() 
    {
     setBackground("images/lvl2.png");
     Mayflower.stopMusic("sound/Pirate.mp3");
     addObject(new Santa(), 45, 45);
     addObject(new Star(), 800, 590);
     //Top Walls
     addObject(new BlueWall(), 0, 0);
     addObject(new BlueWall(), 310, 0);
     addObject(new BlueWall(), 620, 0);
     //left Walls
     addObject(new BlueWallVert(), 0, 31);
     addObject(new BlueWallVert(), 0, 341);
     addObject(new BlueWallVert(), 0, 651);
     //Bottom Walls
     addObject(new BlueWall(), 0, 680);
     addObject(new BlueWall(), 310, 680);
     addObject(new BlueWall(), 620, 680);
     //Right Walls
     addObject(new BlueWallVert(), 888, 31);
     addObject(new BlueWallVert(), 888, 341);
     addObject(new BlueWallVert(), 888, 651);
     //Middle Walls
     
     addObject(new BlueWall(), 231, 494);
     //addObject(new BlueWall(), 351, 494);
     
     addObject(new BlueWall3(), 461, 31);
     addObject(new BlueWall3(), 461, 494);
     //Middle Left Wall
     addObject(new BlueWallVert(), 231, 184);
     //Middle Right Wall
     addObject(new BlueWallVert(), 692, 184);
     
     //Powerups
     addObject(new Heart2(), 530, 560);
     addObject(new Cookie(), 375, 575);
     //Bad
     addObject(new Grinch(), 800, 588);
     addObject(new Coal(), 350, 100);
     addObject(new CoalH(), 525, 100);
     }
     public void act()
     {
     
     }
     
    }