package org.ies.tierno.biblioteca_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Autor {
    private String nif;
    private String name;
    private String surname;
}
