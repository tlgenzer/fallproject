import mayflower.*;

public class Win extends World
{
    int c;
    String[][] arr = new String[16][12];
    public Win(int coin) 
    {
        c= coin;
        setBackground("img/WinPole.png");
        //Stops all Music
        Mayflower.stopMusic("sound/Pirate.mp3");
        Mayflower.stopMusic("sound/gamer.mp3");
        Mayflower.stopMusic("sound/town.mp3");
        Mayflower.stopMusic("sound/BossBattleIntro.mp3");
        Mayflower.stopMusic("sound/MarioWin.mp3");
        Mayflower.stopMusic("sound/Nic.mp3");
        Mayflower.stopMusic("sound/Win.mp3");
        Mayflower.stopMusic("sound/Win.mp3");
        //Play GameOver Music
        Mayflower.playSound("sound/tada.wav");
        Player p = new Player(c);
        addObject(p,0,500);
        Flag f = new Flag();
        addObject(f,260,216);
        c++;
        Block b1 = new Block();
        add(b1,1,2); 
        Block b2 = new Block();
        add(b2,2,4); 
        Block b3 = new Block();
        add(b3,3,6); 

        for(int i = 0; i < arr.length;i++)
        {
            for(int k = 0; k < arr[0].length;k++)
            {
                arr[i][k] = "";
            }

        }
        for(int i =0; i < arr.length; i++)
        {
            Block b = new Block();
            add(b,i,0); 
        }

    }

    public void add(Actor o,int x, int y )
    {

        addObject(o,x*50,Math.abs(600 - ((y+1) * 50)));
    }

    public void act()
    {
        //My attempt to make a reset key...
        // if(Mayflower.isKeyDown( Keyboard.KEY_R ))
        // {
        // //Mayflower.stopMusic("Pirate.wav");
        // //Mayflower.setWorld(new BasicWorld()); 
        // //Runner run = new Runner(); 
        // }
        showText("Score: " + c, 100, 120, Color.RED);

    }
}