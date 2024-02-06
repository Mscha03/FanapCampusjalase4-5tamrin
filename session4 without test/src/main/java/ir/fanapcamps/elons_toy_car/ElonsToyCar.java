package ir.fanapcamps.elons_toy_car;

public class ElonsToyCar {

    private int distanceDriven = 0;
    private int batteryRemain = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryRemain > 0) {
            return "Battery at " + batteryRemain + "%";
        }else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (batteryRemain > 0) {
            distanceDriven += 20;
            batteryRemain -= 2;
        }
    }
}
