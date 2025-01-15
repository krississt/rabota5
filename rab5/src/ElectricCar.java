class ElectricCar extends Vehicle implements Fuelable{
    double batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Electric Car " + this + " starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car " + this + " stopping.");

    }

    @Override
    public void refuel(int percent) {
        batteryLevel += (double) percent;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("Electric Car " + this + " charged to the maximum.");
        }
        System.out.println("Electric Car " + this + " charged to " + batteryLevel + "%");
    }

    @Override
    public void refuel(double percent) {
        batteryLevel += percent;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("Electric Car " + this + " charged to the maximum.");
        } else {
            System.out.println("Electric Car " + this + " charged to " + batteryLevel + "%");
        }
    }

    @Override
    public int getFuelLevel() {
        return (int) batteryLevel;
    }
}
