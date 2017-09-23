package observer;

//主体接口
public interface Subject {
	void registrerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
