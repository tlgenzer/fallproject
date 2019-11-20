
import mayflower.*;
public class Animation
{

    MayflowerImage[] frames;
    int frameRate;
    int currentFrame;
    
    public Animation(int fps, String[] img)
    {
        frameRate = fps;
        frames = new MayflowerImage[img.length];
        for(int i = 0; i < frames.length; i++)
        {
         frames[i]= new MayflowerImage(img[i]);
         frames[i].scale(50,50);
        }
    }
    public int getFrameRate()
    {
        return  frameRate;
    }
    public MayflowerImage getNextFrame()
    {
     currentFrame++;
     if(currentFrame > frames.length)
     {
         currentFrame = 1;
        }
        return frames[currentFrame - 1];
    }

}
