import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero2 hero = new Hero2();
        addObject(hero, 200, 200);
        
        Apple apple = new Apple();
        addObject(apple, 200, 100);
        
        Apple apple2 = new Apple();
        addObject(apple2, 100, 100);
        
        Apple apple3 = new Apple();
        addObject(apple3, 300, 100);
        
        
    }
}
