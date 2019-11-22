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
    public MyWorld()
    {
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
        arr[2][2] = "block";
        arr[3][2] = "block";
        arr[4][2] = "block";

        arr[9][4] = "block";
        arr[7][4] = "block";
        arr[8][4] = "block";

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
                    Player p = new Player();
                    add(p,i,k);

                }
            }
        }
    }

    public void add(Actor o,int x, int y )
    {

        addObject(o,x*50,Math.abs(600 - ((y+1) * 50)));
    }
}
