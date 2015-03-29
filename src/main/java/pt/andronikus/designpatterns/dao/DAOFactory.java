package pt.andronikus.designpatterns.dao;

public class DAOFactory {

    public static CircleDAO getCircleDAO(String sourceType){
        switch (sourceType){
            case "RDBMS":
                return new RDBMDAO();
        }

        return null;
    }
}
