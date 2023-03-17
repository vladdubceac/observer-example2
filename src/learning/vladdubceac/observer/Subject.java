package learning.vladdubceac.observer;

// Implemented by Cricket data to communicate  with observers
public interface Subject {
    void registerObserver(Observer obj);
    void unregisterObserver(Observer obj);
    void notifyObservers();
}
