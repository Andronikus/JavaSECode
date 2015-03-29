package pt.andronikus.designpatterns.factory;

public class Circle implements Shape{
    private int xPos, yPos;
    private int radius;

    public Circle(int x, int y, int r){
        xPos = x;
        yPos = y;
        radius = r;

        System.out.println("Circle constructor");
    }

    @Override
    public void draw(){
        System.out.println("Circle draw()");
    }

    @Override
    public void fillColor(){
        System.out.println("Circle fill color");
    }
}
