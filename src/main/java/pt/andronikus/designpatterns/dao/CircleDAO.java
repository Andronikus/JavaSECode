package pt.andronikus.designpatterns.dao;

import pt.andronikus.designpatterns.factory.*;

public interface CircleDAO {
    public void insertCircle(CircleTransfer circle);
    public CircleTransfer findCircle(int id);
    public void deleteCircle(int id);
}
