package pt.andronikus.designpatterns.abstractfactory;

import pt.andronikus.designpatterns.factory.*;

public class Test {

    public static void main (String[] args){
        Canvas canvas = new Canvas();

        canvas.addNewShape("Circle","DisplayFriendly");
        canvas.addNewShape("Rectangle","PrintFriendly");

        canvas.redraw();
    }
}
