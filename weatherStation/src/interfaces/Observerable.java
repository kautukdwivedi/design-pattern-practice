package interfaces;

public interface Observerable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
