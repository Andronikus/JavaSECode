package pt.andronikus.designpatterns.abstractfactory;

public class PrinterFriendlyRectangle implements PrinterFriendlyShape{

    private int length, height;

    public PrinterFriendlyRectangle(int length, int height){
        this.length = length;
        this.height = height;

        System.out.println("PrinterFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyRectangle draw()");
    }
}
