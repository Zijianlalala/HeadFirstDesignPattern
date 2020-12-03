package ObserverPattern.JavaVersion.observer;

import ObserverPattern.JavaVersion.subject.WeatherData;
import ObserverPattern.OwnVersion.service.Display;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前环境：" + temperature +
                "F degrees and " + humidity +
                "% humidity");
    }
}
