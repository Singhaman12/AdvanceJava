package co.pragra.learning.springdemo.model;

public class ElectricEngine implements IEngine{
    private String type;
    private double horsePower;

    public ElectricEngine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String getEngine() {
        return type;
    }

    @Override
    public double getEnginePower() {
        return horsePower;
    }
}
