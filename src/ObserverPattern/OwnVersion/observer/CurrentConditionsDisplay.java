package ObserverPattern.OwnVersion.observer;

import ObserverPattern.OwnVersion.service.Display;
import ObserverPattern.OwnVersion.subject.Subject;
import ObserverPattern.OwnVersion.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 订阅
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前环境：" + temperature +
                "F degrees and " + humidity +
                "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
