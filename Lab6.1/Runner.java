import mayflower.*;

//This class is the starting point of your program.
//It contains the main method which will execute when you run the project.
public class Runner extends Mayflower
{
    //Construct a Mayflower Window.
    public Runner() 
    {
     //Open a GUI Window with the specified title, width, and height
     //DO NOT WRITE ANY ADDITIONAL CODE IN THIS CONSTRUCTOR!
     //You should only change the arguments to the super method.
     super("Lab 6.1", 922, 738);
    }
    
    //The init method is called as soon 
    
    //as the Mayflower window is opened.
    //This is where you will setup the initial state of your game
    //ie, create the first world of your game
    public void init()
    {
     //Set the argument to true if you want your game to run in Full Screen Mode
     Mayflower.setFullScreen(false);
     
     //Create a new instance of a BasicWorld
     World startingWorld = new Intro();
     
     //Create a new instance of a Santa object
     Santa player = new Santa();
     Tree Tree = new Tree();
     Wall Wall = new Wall();
     
     //Add the player to the startingWorld at position (400, 320)
     startingWorld.addObject(player, 45, 45);
     
     
     
     //Load the startingWorld into the Mayflower Window
     Mayflower.setWorld(startingWorld);
     
    }
    
    //This is the first method that is called when you run your program
    //It is the starting point of your program.
    public static void main(String[] args)
    {
     //Instantiate an instance of this Runner class.
     // The constructor will be called
     // Then the init() method will be called
     //DO NOT WRITE ANY ADDITIONAL CODE IN THIS METHOD!
     new Runner();
    }
}