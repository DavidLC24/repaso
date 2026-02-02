package org.ies.tierno.biblioteca_oop.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.biblioteca_oop.models.Author;

import java.util.Scanner;

@AllArgsConstructor
public class AuthorReader {
    private final Scanner scanner;

    public Author read(){

        System.out.println("//Datos del Autor//");

        System.out.println("NIF: ");
        String nif= scanner.nextLine();

        System.out.println("Nombre: ");
        String name= scanner.nextLine();

        System.out.println("Apellidos: ");
        String surname= scanner.nextLine();

        return new Author(
                nif,
                name,
                surname);
    }
}
