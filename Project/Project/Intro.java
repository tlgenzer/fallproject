import mayflower.*;

public class Intro extends World
{
    public Intro() 
    {
        setBackground("img/intro.png");

     
    }

    public void act()
    {
        if(Mayflower.isKeyDown( Keyboard.KEY_SPACE ))
        {
            World w = new MyWorld(0,false);
            Mayflower.setWorld(w);

        }
    }
}