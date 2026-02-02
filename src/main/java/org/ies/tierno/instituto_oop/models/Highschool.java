package org.ies.tierno.instituto_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Highschool {
    private String name;
    private Student[] students;
}
