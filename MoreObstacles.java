import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoreObstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoreObstacles extends Actor
{
    /**
     * Act - do whatever the MoreObstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 0;
    int dy = 2;
    public void act()
    {
        
        setLocation(getX() + dx, getY() + dy);
        if(isAtEdge())
        {
            dy++;
            dy = -dy;
            move(dy);
        }
    }
}
