package finalReview.observer.dec2018Q1;


import java.util.List;

public class Bit extends Observable implements Observer{
    private boolean isOn;

    public void flip() {
        // flip the bit
        isOn = !isOn;

        // bit is turned off (e.g. from 1 to 0)
        if (!isOn) {
            notifyObservers(isOn);
        }
    }

    // listen to the smaller bit next to it
    @Override
    public void update(Observable o, Object arg) {
        // the bit to my right is turned off now, flip myself
        if ((boolean) arg == false) {
            flip();
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
