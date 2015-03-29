package pt.andronikus.designpatterns.dao;

import pt.andronikus.designpatterns.factory.*;

public class Test {

    public static void main (String[] args){
        Circle circle = new Circle(10,20,2);
        System.out.println(circle);

        CircleTransfer circleTranfer = circle.getCircleTransferObject();
        CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");

        circleDAO.insertCircle(circleTranfer);
    }
}
