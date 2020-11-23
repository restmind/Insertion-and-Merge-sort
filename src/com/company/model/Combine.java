package com.company.model;

public class Combine {
    public String model;
    public int capacityOfGrainInKg;
    public int fuelConsumptionOnOneHectare;
    public int enginePowerInHorsePower;

    public Combine(int capacityOfGrainInKg, int enginePowerInHorsePower) {
        this.capacityOfGrainInKg = capacityOfGrainInKg;
        this.enginePowerInHorsePower = enginePowerInHorsePower;
    }

    public Combine() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacityOfGrainInKg(int capacityOfGrainInKg) {
        this.capacityOfGrainInKg = capacityOfGrainInKg;
    }

    public void setFuelConsumptionOnOneHectare(int fuelConsumptionOnOneHectare) {
        this.fuelConsumptionOnOneHectare = fuelConsumptionOnOneHectare;
    }

    public void setEnginePowerInHorsePower(int enginePowerInHorsePower) {
        this.enginePowerInHorsePower = enginePowerInHorsePower;
    }

    @Override
    public String toString() {
        return "Combine{" +
                "model='" + model + '\'' +
                ", capacityOfGrainInKg=" + capacityOfGrainInKg +
                ", fuelConsumptionOnOneHectare=" + fuelConsumptionOnOneHectare +
                ", enginePowerInHorsePower=" + enginePowerInHorsePower +
                '}';
    }
}
