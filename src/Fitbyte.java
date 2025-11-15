public class Fitbyte {
    private int age;
    private int restingHeartRate;
    private int maximumHeartRate;
    private double percentageOfMaximum;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double getMaximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        this.percentageOfMaximum = percentageOfMaximum;
        return (getMaximumHeartRate() - this.restingHeartRate) * (this.percentageOfMaximum) + this.restingHeartRate;
    }
}
