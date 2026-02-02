package org.ies.tierno.biblioteca_oop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private Long isbn;
    private String title;
    private int year;
    private Autor[] autors;
}
