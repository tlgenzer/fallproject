import mayflower.*;
public class Player extends AnimatedActor
{
    String[] img = new String[10];
    int fps = 33333333;
    Animation idle;
    public double speed = 2;
    private int ani = 0;
    private int timer = 0;
    private int frame = 1;
    private double acceleration = 1;
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
        checkMove();
        timer++;
        getWorld().showText("ani: " + ani, 10, 30);
        getWorld().showText("acceleration: " + acceleration, 100, 30);
        gravity();
        if(Mayflower.isKeyDown( Keyboard.KEY_F ))
        {
            setLocation( getX(), getY()-100 );
            
        }
    }

    public void checkMove()
    {

        if(Mayflower.isKeyDown( Keyboard.KEY_A ))
        {
            setLocation( getX()-speed, getY() );
            ani=1;
        }

        if(Mayflower.isKeyDown( Keyboard.KEY_D ))
        {
            setLocation( getX()+speed, getY() );
            ani=1;  
        }

        if(Mayflower.isKeyDown( Keyboard.KEY_W ))
        {
            setLocation( getX(), getY()-acceleration );
            ani=1;
        }

        if(Mayflower.isKeyDown( Keyboard.KEY_S ))
        {
            setLocation( getX(), getY()+acceleration );
            ani=1;
        }
        if(ani==1&&timer>=8&&frame==1)
        {
            //setImage("images/SantaAni/Santa1.png");
            // timer=0;
            // frame*=-1;
        }

    }
    public void gravity()
    {
        if(isTouching(Block.class))
            {
                acceleration=1;
            } 
        if(!isTouching(Block.class))
         {
             setLocation(getX(),getY()+acceleration*1.2 );
             if(acceleration<9.8)
             {
                 
                acceleration= acceleration*1.01;
            }
            }
         
    }
}
