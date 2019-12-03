import mayflower.*;
/**
 * Write a description of class MyMayflower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MyMayflower extends Mayflower
{
    //Constructor
    
    public MyMayflower()
       {
           super("Project", 800, 600);
       }
    public void init()
       {
           Mayflower.playSound("sound/gamer.wav");
           Mayflower.playSound("sound/town.wav");
             Mayflower.setFullScreen(false);
             World w = new Intro();
             Mayflower.setWorld(w);
       }
}
