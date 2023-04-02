package com.epam.training.student_Aleksei_Guskov.fundamental.main_task.planes;

import java.util.Objects;

abstract public class Plane {
    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance,
                 int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "\nPlane{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object otherPlane) {
        Plane plane = (Plane) otherPlane;
        boolean nullEquals = (plane == null && otherPlane == null) || (otherPlane != null && plane.equals(otherPlane));
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                nullEquals &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}