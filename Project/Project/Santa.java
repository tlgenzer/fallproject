import mayflower.*; //tell Java we will be using the Mayflower API

public class Santa extends Actor
{
    private int lives = 5;
    private double speed = 2;
    private int ani = 0;
    private int timer = 0;
    private int frame = 1;
    //This is the constructor. It is called exactly once, when the Mayrio object is first created
    public Santa() 
    {
        setImage("images/SantaAni/Santa0.png");
    }

    //This method is called once every frame (about 60 times per second)
    public void act()
    {
        getWorld().showText("Lives: " + lives, 720, 70);
        //SPEED DEBUGING TEXT
        getWorld().showText("Speed: " + speed, 10, 30);
        //END OF SPEED DEBUGGING
        int oldX = getX();
        int oldY = getY();
        //Movement statments
        timer++;

        checkMove();
        //Death -=- Touching for Santa class
        // if(isTouching(Wall.class)||isTouching(Coal.class)||isTouching(WallV.class)||isTouching(Wall3.class)||isTouching(BlueWall.class)||isTouching(BlueWall3.class)||isTouching(BlueWallVert.class))
        // {
        // setLocation( 45, 45);
        // Mayflower.playSound("sound/death.wav");
        // lives=lives-1;
        // }
        // if(isTouching(Grinch.class))
        // {
        // Mayflower.playSound("sound/gameover.wav");
        // lives=0;
        // }
        // if(isTouching(CoalH.class))
        // {
        // Mayflower.playSound("sound/death.wav");
        // lives=lives-2;
        // }
        // //Gets to Objects touching
        // if(isTouching(Tree.class))
        // {
        // setLocation( 45, 45);
        // Mayflower.playSound("sound/bongo.wav");
        // Mayflower.setWorld(new Level2());
        // setLocation( 45, 45);
        // }
        // if(isTouching(Heart.class))
        // {
        // lives++;
        // Mayflower.playSound("sound/powerup.wav");
        // }
        // if(isTouching(Heart2.class))
        // {
        // lives++;
        // Mayflower.playSound("sound/powerup.wav");
        // }
        // if(isTouching(Cookie.class))
        // {
        // speed=speed+1;
        // Mayflower.playSound("sound/powerup.wav");
        // }
        // //BossBattle
        // if(isTouching(David.class))
        // {
        // setLocation( 45, 45);
        // Mayflower.setWorld(new BossBattle());
        // //HERE
        // }
        // if(isTouching(DavidWin.class))
        // {
        // setLocation( 45, 45);
        // Mayflower.setWorld(new Win());
        // //HERE
        // }
        // if(isTouching(Star.class))
        // {
        // setLocation( 500, 500);
        // Mayflower.playSound("sound/star.wav");
        // Mayflower.setWorld(new BossBattleIntro());
        // //HERE
        // }
        //DEVELOPER OPTIONS
        if(Mayflower.isKeyDown( Keyboard.KEY_O )&&(Mayflower.isKeyDown( Keyboard.KEY_P )))
        {
            speed=10;
            lives=100000000;
        }
        if(Mayflower.isKeyDown( Keyboard.KEY_D )&&(Mayflower.isKeyDown( Keyboard.KEY_O )))
        {
            speed=2;
            lives=5;
        }
        // if(Mayflower.isKeyDown( Keyboard.KEY_SPACE ))
        // {
        // setLocation( 45, 45);
        // Mayflower.setWorld(new BasicWorld());
    }
    // if(isTouching(Flag.class))
    // {
    // setLocation( getX(), getY()+1 );
    // }
    // if(Mayflower.isKeyDown( Keyboard.KEY_K ))
    // {
    // setLocation( 45, 45);
    // Mayflower.setWorld(new Win());
    // }

    //if(Mayflower.isKeyDown( Keyboard.KEY_M )&&(Mayflower.isKeyDown( Keyboard.KEY_A )&&(Mayflower.isKeyDown( Keyboard.KEY_Y ))))
    //{
    //  Mayflower.setWorld(new BossBattle());
    //}
    //GameOver Screen
    //END OF DEVELOPER OPTIONS
    if(lives==0)
    {
        Mayflower.setWorld(new GameOver());
    }
}
public void checkMove()
{
ani=0;
if(Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
{
setLocation( getX()-speed, getY() );
ani=1;
}

if(Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
{
setLocation( getX()+speed, getY() );
ani=1;
}

if(Mayflower.isKeyDown( Keyboard.KEY_UP ))
{
setLocation( getX(), getY()-speed );
ani=1;
}

if(Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
{
setLocation( getX(), getY()+speed );
ani=1;
}
if(ani==1&&timer>=8&&frame==1)
{
setImage("images/SantaAni/Santa1.png");
timer=0;
frame*=-1;
}
if(ani==1&&timer>=8&&frame==-1)
{
setImage("images/SantaAni/Santa0.png");
timer=0;
frame*=-1;
}
if(ani==0)
{
      setImage("images/SantaAni/Santa0.png");
      }
    }
}