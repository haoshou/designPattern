package observer;

public interface Subject {
	void registrerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
