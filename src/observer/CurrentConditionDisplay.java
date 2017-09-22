package observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {
	private float temp;
	private float humidty;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registrerObserver(this);
	}

	public void display() {
		System.out.println("当前情况："+"温度："+temp+"湿度："+humidty);
	}

	public void update(float temp, float humidty, float pressure) {
		this.temp = temp;
		this.humidty = humidty;
		display();
	}
}
