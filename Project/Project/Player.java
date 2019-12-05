import mayflower.*;
public class Player extends AnimatedActor
{
    String[] idlearr = new String[10];
    String[] walkarrR = new String[10];

    int fps = 33333333;
    Animation idle;
    Animation idleLeft;
    Animation walkRight;
    Animation walkLeft;
    boolean isFacingLeft;
    MyWorld world1;
    MyWorld2 world2;
    public double speed = 3.4;
    int ani = 0;
    int timer = 0;
    int frame = 1;
    double acceleration = 1;
    double vel = 1;
    boolean isOnGround;
    int ySpeed;
    //Visual Variables
    int lives = 3;
    public static int coins;
    public Player(int coin)
    {

        //Animation code for the Player
        super(33333333);
        coins = coin;

        for(int i = 0; i < 10; i++)
        {
            idlearr[i] = "img/ninjagirl/Idle" + (i) + ".png";
            walkarrR[i] = "img/ninjagirl/Run" + (i) + ".png";

        }
        idle = new Animation(fps, idlearr, false);
        idleLeft = new Animation(fps, idlearr, true);
        walkRight = new Animation(fps, walkarrR, false);
        walkLeft = new Animation(fps, walkarrR, true);
        setAnimation(idle);
    }

    //This is the act method that repeats forever.
    public int getCoinCount()
    {
        return coins;   
    }

    public void act()
    {

        super.act();
        checkMove();
        timer++;
        //System.out.println(coins);
        getWorld().showText("ani: " + ani, 10, 30);
        getWorld().showText("acceleration: " + acceleration, 100, 30);
        getWorld().showText("Lives: " + lives, 550, 30, Color.BLUE);
        getWorld().showText("Coins: " + coins, 550, 120, Color.BLUE);
        gravity();
        if(getX() >= 800 && !(getWorld() instanceof MyWorld2) && !(getWorld() instanceof Win))
        {
            System.out.println("right");
            Mayflower.setWorld(new MyWorld2(coins));
        }
        else if(getX() <= -1 && !(getWorld() instanceof MyWorld )&& !(getWorld() instanceof Win))
        {
            System.out.println("left");
            Mayflower.setWorld(new MyWorld(coins, true));
        }

        if(checkTouching(Block.class))
        {
            isOnGround = true;
        }
        else isOnGround = false;
        if(isInside())
        {
            setLocation(getX(),getY() - 3);   
        }
        if(checkTouching(Enemy.class))
        {
            lives--;
            Mayflower.playSound("sound/death.wav");
            setLocation(0,600-50);   
        }
        if(getY() > 700)
        {
         lives--;
            Mayflower.playSound("sound/death.wav");
            setLocation(0,600-50);      
        }
        
        if(lives==0)
        {
            Mayflower.setWorld(new GameOver());
        }
    }

    //Checks if the Player is inside a block.
    public boolean isInside()
    {
        if(checkTouching(Block.class))
        {
            if(getOneIntersectingObject(Block.class).getY() < getY() + 49)
            {
                return true;
            }
        }
        return false;
    }

    //This is a method to simplify the isTouching method
    public boolean checkTouching(Class a)
    {
        if(this.isTouching(a))
        {
            return true;
        }
        return false;
    }

    //This method checks for movement by the keys A and D and also updated the animation dirrection.
    public void checkMove()
    {

        if(Mayflower.isKeyDown( Keyboard.KEY_A ))
        {
            setLocation( getX()-speed, getY() );
            setAnimation(walkLeft);
            isFacingLeft = true;
            //Mayflower.playMusic("sound/running.mp3");
        }

        else if(Mayflower.isKeyDown( Keyboard.KEY_D ))
        {
            setLocation( getX()+speed, getY() );
            setAnimation(walkRight);
            isFacingLeft = false;
            //Mayflower.playMusic("sound/running.mp3");
        }
        else
        {
            if(isFacingLeft)
            {
                setAnimation(idleLeft); 
            }
            else setAnimation(idle);

        }

        //This is the code for jumping and the acceleration behind that
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

    //This method creates gravity.
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

