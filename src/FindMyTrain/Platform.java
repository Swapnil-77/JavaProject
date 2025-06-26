package FindMyTrain;

public class Platform {
    public int PlatformNumber;
    private Train train;
    public Platform(int platformNumber) {
        PlatformNumber = platformNumber;
    }

    public int getPlatformNumber() {
        return PlatformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        PlatformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "platform{" +
                "PlatformNumber=" + PlatformNumber +
                ", train=" + train +
                '}';
    }
}
