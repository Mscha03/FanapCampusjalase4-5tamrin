package ir.fanapcamps.need_for_speed;

class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int batteryRemain = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryRemain <= 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        distanceDriven += speed;
        batteryRemain -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < distance){
            car.drive();
        }
        return !car.batteryDrained();
    }
}
