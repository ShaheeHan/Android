
package observerpattern;

// This is the subject(Publisher)
// This will notify all the observers(subscribers) when something changes
public interface InterfaceWeatherStation {
    
    void add( InterfaceDisplayDevice interfaceDisplayDevice);
    void remove(InterfaceDisplayDevice interfaceDisplayDevice);
    void notifY();
}
