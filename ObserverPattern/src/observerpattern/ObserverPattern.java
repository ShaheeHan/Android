
package observerpattern;

public class ObserverPattern {

    
    public static void main(String[] args) {
        
        ConcreteWeatherStation concreteWeatherStation = new ConcreteWeatherStation(20,76);
        
        InterfaceDisplayDevice phoneDisplay = new ConcretePhoneDisplay(concreteWeatherStation);
        InterfaceDisplayDevice wristWatchDisplay = new ConcreteWristWatchDisplay(concreteWeatherStation);
        
        concreteWeatherStation.add(wristWatchDisplay);
        concreteWeatherStation.add(phoneDisplay);
        
        System.out.println("Current weather \n"+ concreteWeatherStation.getState());
        System.out.println();
       
        
        concreteWeatherStation.makeChange();
        
        
    }
    
}
