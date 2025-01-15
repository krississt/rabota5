interface Fuelable {
    void refuel(int liters);

    int getFuelLevel();

    default void refuel(double gallons) {
        refuel((int) (gallons * 3.785));
    }
}

