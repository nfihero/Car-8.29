public class CarTester {
    public static void main(String Args[]) {
        Car car1 = new Car();

        System.out.println(car1);

        Car car2 = new Car(20,7);
        System.out.println(car2);
        car1.useGas(4);
        System.out.println(car1);

    }
}
