import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero2 hero = new Hero2();
        addObject(hero, 200, 200);
        
    }
}
