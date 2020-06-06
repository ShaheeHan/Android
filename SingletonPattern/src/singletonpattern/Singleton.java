
package singletonpattern;

public class Singleton {
    
    // variables associated with singleton pattern
    private static Singleton singletonInstance = null;
    private Singleton(){}
    
    public static Singleton getInstance()
    {
        if(singletonInstance == null)
        {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
    
    
    // methods associated with singleton pattern
    
}
