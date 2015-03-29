package pt.andronikus.designpatterns.abstractfactory;

public interface ShapeFactory {
    public Shape getShape(String sourceType);
}
