import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero2 here.
 * 
 * @author Bosco Meng
 * @version 11/4/2025
 */
public class Hero2 extends Actor
{
    /**
     * Act - do whatever the Hero2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 1;
    int rotation = 180;
    public void act()
    {
        
        move(dx);
        if(isAtEdge())
        {
            dx = -dx;
        }
        if(Greenfoot.mouseClicked(null))
        {
            rotation += 180;
            setRotation(rotation);
        }
        if(isTouching(null))
        {
            setLocation(50, 50);
        }
    }
}
