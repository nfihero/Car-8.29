public class Car {
    private double gasTankCapacity;
    private double gasTankLevel;
    private double totalMiles;

    public Car() {
        gasTankCapacity = 15;
        gasTankLevel = 15;
        totalMiles = 0;
    }

    public Car(double CapacityParam, double LevelParam, double milesParam) {
        gasTankLevel = LevelParam;
        gasTankCapacity = CapacityParam;
        totalMiles = milesParam;
    }

    public void useGas(double gasUsed) {
        gasTankLevel = gasTankLevel - gasUsed;
    }


    public void fillGas(double gasFilled) {
        gasTankLevel = gasTankLevel + gasFilled;
    }

    public double carMiles() {
        return totalMiles;
    }

    public double gasLeft() {
        return gasTankLevel;
    }
    public String toString() {
        return "Gas info:\nCapacity: " + gasTankCapacity + " Level: " + gasTankLevel;
    }

}
