import mayflower.*;
import java.util.*;
/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    String[][] arr = new String[16][12];
    int c;
    
    
    public MyWorld2(int coin)
    {
        c = coin;
        Mayflower.showBounds(true);
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

    }

    public void InitArr()
    {
        for(int i =0; i < arr.length; i++)
        {
            arr[i][0] = "block";   
        }
        arr[2][0] = "";
        arr[3][0] = "";
        arr[4][0] = "";
        arr[5][0] = "";
        arr[6][0] = "";
        
        arr[3][2] = "block";
        arr[4][2] = "block";
        arr[5][2] = "block";
        

        arr[0][1] = "player";
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
         Enemy e = new Enemy(150,250);
         addObject(e,200,400);
        Enemy e2 = new Enemy(350,550);
         addObject(e2,500,400);
        Enemy e3 = new Enemy(450,600);
         addObject(e3,500,400);
        Star s = new Star(2, c);
        addObject(s,730,500);
         Coin c = new Coin();
         addObject(c,((int)(Math.random()*7)*100)+50,509);
    }

    public void add(Actor o,int x, int y )
    {

        addObject(o,x*50,Math.abs(600 - ((y+1) * 50)));
    }
}
