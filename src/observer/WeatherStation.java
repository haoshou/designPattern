package observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(10, 20, 30);
	}
}
