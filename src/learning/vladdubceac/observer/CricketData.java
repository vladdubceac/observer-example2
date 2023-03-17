package learning.vladdubceac.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;
    private List<Observer> observers ;

    public CricketData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregisterObserver(Observer obj) {
        observers.remove(observers.indexOf(obj));
    }

    @Override
    public void notifyObservers() {
        for(Iterator<Observer> it = observers.iterator(); it.hasNext();){
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns(){
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets(){
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers(){
        return (float)10.2;
    }

    public void dataChanged(){
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
