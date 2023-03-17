package learning.vladdubceac.observer;

public class Client {

    public static void main(String[] args) {
        // create objects for testing
        AverageScore averageScoreDisplay = new AverageScore();
        CurrentScore currentScoreDisplay = new CurrentScore();

        // pass the displays to cricket data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        cricketData.dataChanged();

        // remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        cricketData.dataChanged();
    }
}
