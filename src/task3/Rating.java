package task3;

public class Rating {
    private int hundredPointSystem;
    private int fivePointSystem;
    private int twelvePointSystem;

    public Rating(int hundredPointSystem, int fivePointSystem, int twelvePointSystem) {
        this.hundredPointSystem = hundredPointSystem;
        this.fivePointSystem = fivePointSystem;
        this.twelvePointSystem = twelvePointSystem;
    }

    public Rating() {

    }


    public int getHundredPointSystem() {
        return hundredPointSystem;
    }

    public void setHundredPointSystem(int hundredPointSystem) {
        this.hundredPointSystem = hundredPointSystem;
    }

    public int getFivePointSystem() {
        return fivePointSystem;
    }

    public void setFivePointSystem(int fivePointSystem) {
        this.fivePointSystem = fivePointSystem;
    }

    public int getTwelvePointSystem() {
        return twelvePointSystem;
    }

    public void setTwelvePointSystem(int twelvePointSystem) {
        this.twelvePointSystem = twelvePointSystem;
    }

    @Override
    public String toString() {
        return " hundred point system = " + hundredPointSystem +
                ", five point system = " + fivePointSystem +
                ", twelve point system = " + twelvePointSystem;
    }
}
