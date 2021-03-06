import mayflower.*;
import java.util.*;
/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    String[][] arr = new String[16][12];
    int c;
    boolean from22;
    public MyWorld(int coin, boolean from2)
    {
        Mayflower.playMusic("sound/gamer.mp3");
        Mayflower.playMusic("sound/town.mp3");
        c = coin;
        from22 = from2;
        setBackground("img/Background.png");
        for(int i = 0; i < arr.length;i++)
        {
            for(int k = 0; k < arr[0].length;k++)
            {
                arr[i][k] = "";
            }

        }
        InitArr();

        InitLevel();
    }

    public void act()
    {
        //showText("Coins: " + c, 550, 420, Color.BLUE);
        //System.out.println(from22);
    }

    public void InitArr()
    {
        for(int i =0; i < arr.length; i++)
        {
            arr[i][0] = "block";   
        }
        arr[2][2] = "block";
        arr[3][2] = "block";
        arr[4][2] = "block";

        arr[9][4] = "block";
        arr[7][4] = "block";
        arr[8][4] = "block";
    
        if(c<1)
        {
            arr[0][1] = "player";
            System.out.println(0);
        }
        if(from22)
        {
            arr[15][1] = "player";
        }
    }

    public void InitLevel()
    {
        for(int i = 0; i < arr.length;i++)
        {
            for(int k = 0; k < arr[0].length;k++)
            {
                if(arr[i][k].equals("block"))
                {
                    Block b = new Block();
                    add(b,i,k);
                }
                else if(arr[i][k].equals("player"))
                {
                    Player p = new Player(c);
                    add(p,i,k);

                }

            }
        }
        Enemy e = new Enemy(200,400);
        addObject(e,250,450);
        Enemy e1 = new Enemy(99,200);
        addObject(e1,100,400);
        Enemy e2 = new Enemy(350,475);
        addObject(e2,450,300);
        Enemy e3 = new Enemy(500,700);
        addObject(e3,650,500);
       

        Coin c = new Coin();
        addObject(c,((int)(Math.random()*7)*100)+50,509);
    }

    public void add(Actor o,int x, int y )
    {

        addObject(o,x*50,Math.abs(600 - ((y+1) * 50)));
    }
}
