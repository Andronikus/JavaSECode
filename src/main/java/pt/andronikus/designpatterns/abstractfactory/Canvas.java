package pt.andronikus.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addNewShape(String shapeType, String factoyType) {

        ShapeFactory factory = null;

        switch (factoyType) {
            case "PrinterFriendly":
                factory = new PrinterFriendlyFactory();
                break;
            case "DisplayFriendly":
                factory = new DisplayFriendlyFactory();
                break;
        }

        Shape shape = factory.getShape(shapeType);

        shapeList.add(shape);
    }

    public void redraw(){
        Iterator<Shape> it = shapeList.iterator();

        while(it.hasNext()){
            Shape shape = it.next();
            shape.draw();
        }
    }
}
