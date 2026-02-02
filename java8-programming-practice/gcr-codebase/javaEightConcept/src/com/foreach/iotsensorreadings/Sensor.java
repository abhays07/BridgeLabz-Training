package com.foreach.iotsensorreadings;

public class Sensor {

    private int sensorId;
    private double value;

    public Sensor(int sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }

    public int getSensorId() {
        return sensorId;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sensor [sensorId=" + sensorId + ", value=" + value + "]";
    }
}

