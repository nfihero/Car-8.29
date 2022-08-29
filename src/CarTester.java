public class CarTester {
    public static void main(String Args[]) {
        Car car1 = new Car();
        Car car2 = new Car(20,7,200000);

        System.out.println("Car 1:\n" + car1);
        car1.useGas(4);
        double remainingFuel;
        double miles;

        System.out.println("Car 1 after a ride:\n" + car1);
        remainingFuel = car1.gasLeft();
        System.out.println("Gas remaining: "+ remainingFuel);
        car1.fillGas(4);
        remainingFuel = car1.gasLeft();
        System.out.println("Gas after refuel: " + remainingFuel);
        miles = car2.carMiles();
        System.out.println("Total miles: " + miles);


    }
}
