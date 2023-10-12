import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Stage extends World
{
    public Stage()
    {
    super(1000, 600, 1);
    this.setBackground (new GreenfootImage("Hutan.jpg"));
    }
    private void prepare()
    {
        player player = new player();
        addObject(player,166,503);
    }
}
