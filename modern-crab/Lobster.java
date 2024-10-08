// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAround();
        moveAround();
        eat();
    }

    /**
     * 
     */
    public void turnAround()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360) - 45);
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        Actor worm = getOneIntersectingObject(Worm.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("game-over.mp3");
        }
        if (worm != null) {
            getWorld().addObject( new  Lobster(), getX(), getY());
            getWorld().removeObject(worm);
            Greenfoot.playSound("game-character.mp3");
        }
    }
}
