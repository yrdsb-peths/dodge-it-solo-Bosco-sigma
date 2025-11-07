import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 0;
    int dy = 3;
    public void act()
    {
        setLocation(getX() + dx, getY() + dy);
        if(isAtEdge())
        {
            dy = -dy;
            move(dy);
        }
    }
}
