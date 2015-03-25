package pt.andronikus.designpatterns.singleton;

public class Logger {

    // declare the constructor private to prevent clients from instantiating and object of this class directly
    private Logger(){}
    private static Logger myInstance;

    public static Logger getInstance(){
        if(myInstance == null){
            // This is the first time method is called
            myInstance = new Logger();
        }

        return myInstance;
    }

    public void log(String s){
        System.err.println(s);
    }
}

// Problema com varias threads! Não é garantida que apenas existe um objecto da classe