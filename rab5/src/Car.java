class Car extends Vehicle implements Fuelable {
    int fuelLevel;

    public Car(String brand, String model) {
        super(brand, model);
        this.fuelLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Car " + this + " starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + this + " stopping.");
    }

    @Override
    public void refuel(int liters) {
        fuelLevel += liters;
        System.out.println("Car " + this + " refueled with " + liters + " liters. Fuel level: " + fuelLevel);
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}
