
package observerpattern;


class ConcreteWristWatchDisplay implements InterfaceDisplayDevice
{
    ConcreteWeatherStation concreteWeatherStation;
    public ConcreteWristWatchDisplay(ConcreteWeatherStation concreteWeatherStation)
    {
        this.concreteWeatherStation = concreteWeatherStation;
    }

    @Override
    public void update() {
        System.out.println("Displaying on wrist watch....");
        System.out.println("Updated "+concreteWeatherStation.getState());
    }
    
}