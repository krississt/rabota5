
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("BMW", "3 Series"),
                new Truck("Toyota", "Tundra"),
                new ElectricCar("Xiaomi", "SU7")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            ((Fuelable) vehicle).refuel(50);
            ((Fuelable) vehicle).refuel(2.5);
            System.out.println("Fuel level: " + ((Fuelable) vehicle).getFuelLevel());
            System.out.println("---------");
        }
    }
}