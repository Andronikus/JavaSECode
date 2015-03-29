package pt.andronikus.designpatterns.abstractfactory;

public class DisplayFriendlyRectangle implements DisplayFriendlyShape{

    private int length, height;

    public DisplayFriendlyRectangle(int length, int height){
        this.length = length;
        this.height = height;

        System.out.println("DisplayFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyRectangle draw()");
    }
}
