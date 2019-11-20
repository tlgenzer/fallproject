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
        for(int i = 0; i < 12; i++)
        {
            arr[i][i] = "block";

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
                        addObject(b,i*50,Math.abs(600 - ((k+1) * 50)));
                    }
                }
            }
        }
    }
