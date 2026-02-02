package org.ies.tierno.taller_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Vehicle {
    private VehicleType vehicleType;
    private int maxSpeed;
    private String color;
    private String tuition;
}
