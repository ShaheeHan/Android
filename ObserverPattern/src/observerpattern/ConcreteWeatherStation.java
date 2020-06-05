
package observerpattern;

import java.util.ArrayList;


class ConcreteWeatherStation  implements InterfaceWeatherStation
{
    private int temperature, humidity;
    
    
    ArrayList<InterfaceDisplayDevice> observers;
    public ConcreteWeatherStation(int temperature, int humidity)
    {
        this.humidity = humidity;
        this.temperature = temperature;
        observers = new ArrayList<InterfaceDisplayDevice>();
    }
   
    @Override
    public void add(InterfaceDisplayDevice interfaceDisplayDevice) {
        observers.add(interfaceDisplayDevice);
    }

    @Override
    public void remove(InterfaceDisplayDevice interfaceDisplayDevice) {
        
        
    }
    @Override
    public void notifY() {
        
        for(InterfaceDisplayDevice observer : observers)
        {
            observer.update();
        }
    }
    public void makeChange()
    {
        temperature = 23;
        humidity = 68;
        notifY();
    }
    public String getState()
    {
        return "Temperature : "+temperature+" celsius and Humidity: "+humidity+"%";
    }

}