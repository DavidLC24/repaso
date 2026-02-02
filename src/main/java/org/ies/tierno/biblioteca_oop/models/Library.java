package org.ies.tierno.biblioteca_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Library {
    private String name;
    private Book[] books;
}
