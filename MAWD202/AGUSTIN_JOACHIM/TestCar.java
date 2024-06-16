public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);

        Car car1 = new Car("Camry");
        car1.printCarDetails();
        System.out.println();

        Car car2 = new Car("Veloz");
        car2.printCarDetails();
        System.out.println();

        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}