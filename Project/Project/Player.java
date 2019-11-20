import mayflower.*;
public class Player extends AnimatedActor
{
    String[] img = new String[10];
    int fps = 33333333;
    Animation idle;
    public Player()
    {
        super(33333333);
        for(int i = 0; i < 10; i++)
        {
            img[i] = "img/ninjagirl/Idle" + (i) + ".png";
            
        }
        idle = new Animation(fps, img);
        setAnimation(idle);
    }
public void act()
{
    super.act();
}

}
