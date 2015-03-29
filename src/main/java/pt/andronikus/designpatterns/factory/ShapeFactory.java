package pt.andronikus.designpatterns.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle":
                return new Circle(4,6,4);
            case "Rectangle":
                return new Rectangle(5,8);
        }
        return null;
    }
}
