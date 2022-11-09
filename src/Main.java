public class Main {
    public static void main(String[] args) {
        Car car = new Car("car", 4 );
        Truck truck = new Truck( "truck1", 6);
        Bicycle bicycle = new Bicycle("bicycle", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(truck);
        System.out.println();

    }
}