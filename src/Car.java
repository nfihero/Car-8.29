public class Car {
    private double gasTankCapacity;
    private double gasTankLevel;

    public Car() {
        gasTankCapacity = 15;
        gasTankLevel = 15;
    }

    public Car(double CapacityParam, double LevelParam) {
        gasTankLevel = LevelParam;
        gasTankCapacity = CapacityParam;
    }

    public void useGas(double gasUsed) {
        gasTankLevel = gasTankLevel - gasUsed;
    }

    public String toString() {
        return "Gas info:\nCapacity: " + gasTankCapacity + " Level: " + gasTankLevel;
    }

}
