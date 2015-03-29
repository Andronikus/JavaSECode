package pt.andronikus.designpatterns.dao;

public class RDBMDAO implements CircleDAO{
    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("insertCircle implementation");
    }

    @Override
    public CircleTransfer findCircle(int id) {
        return null;
    }

    @Override
    public void deleteCircle(int id) {
        System.out.println("deleteCircle implementation");
    }
}
