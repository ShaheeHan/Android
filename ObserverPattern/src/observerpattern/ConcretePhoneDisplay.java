
package observerpattern;


class ConcretePhoneDisplay implements InterfaceDisplayDevice
{
    ConcreteWeatherStation concreteWeatherStation;
    public ConcretePhoneDisplay(ConcreteWeatherStation concreteWeatherStation)
    {
        this.concreteWeatherStation = concreteWeatherStation;
    }

    @Override
    public void update() {
        System.out.println("Displaying on phone....");
        System.out.println("Updated "+concreteWeatherStation.getState());
    }
    
}
