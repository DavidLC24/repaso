package org.ies.tierno.instituto_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String name;
    private String surname;
    private String address;
}
