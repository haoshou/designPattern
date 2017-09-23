package observer;

import java.util.ArrayList;

//主体实现类
public class WeatherData implements Subject {
	private ArrayList observers = new ArrayList();
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = observers;
	}

	//注册观察者
	public void registrerObserver(Observer observer) {
		observers.add(observer);
	}

	//移除观察者
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	//通知观察者
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
