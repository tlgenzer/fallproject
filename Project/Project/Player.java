import mayflower.*;
public class Player extends AnimatedActor
{
    String[] idlearr = new String[10];
    String[] walkarrR = new String[10];
    
    int fps = 33333333;
    Animation idle;
    Animation walkRight;
    Animation walkLeft;
    public double speed = 3.4;
    int ani = 0;
    int timer = 0;
    int frame = 1;
    double acceleration = 1;
    double vel = 1;
    boolean isOnGround;
    int ySpeed;
    public Player()
    {
        super(33333333);
        for(int i = 0; i < 10; i++)
        {
            idlearr[i] = "img/ninjagirl/Idle" + (i) + ".png";
            walkarrR[i] = "img/ninjagirl/Run" + (i) + ".png";
            

        }
        idle = new Animation(fps, idlearr, false);
        walkRight = new Animation(fps, walkarrR, false);
        walkLeft = new Animation(fps, walkarrR, true);
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
        if(checkTouching(Block.class))
        {
            isOnGround = true;
        }
        else isOnGround = false;
    }

    public boolean checkTouching(Class a)
    {
        if(this.isTouching(a))
        {
            return true;
        }
        return false;
    }

    public void checkMove()
    {

        if(Mayflower.isKeyDown( Keyboard.KEY_A ))
        {
            setLocation( getX()-speed, getY() );
            setAnimation(walkLeft);
        }

        else if(Mayflower.isKeyDown( Keyboard.KEY_D ))
        {
            setLocation( getX()+speed, getY() );
            setAnimation(walkRight);
        }
        else
        {
            setAnimation(idle);
        }
        
        if(Mayflower.isKeyDown( Keyboard.KEY_W ))
        {
            int groundLevel = getWorld().getWidth() - getImage().getHeight()/2;
            if(!isOnGround)
            {
                ySpeed++; // adds gravity effect
                setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
                if (getY()>=groundLevel) // has landed (reached ground level)
                {
                    setLocation(getX(), groundLevel); // set on ground  

                }

            }
            else
            {
                ySpeed = -20;
                setLocation(getX(),getY() + ySpeed);
            }
        }
        
        
        if(ani==1&&timer>=8&&frame==1)
        {
            //setImage("images/SantaAni/Santa1.png");
            // timer=0;
            // frame*=-1;
        }

    }

    public void addVelocity(int y)
    {

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

                acceleration= acceleration*1.05;
            }
        }

    }
}
