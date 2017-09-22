package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers = new ArrayList();
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = observers;
	}

	public void registrerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for(int i = 0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temp,humidity,pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
