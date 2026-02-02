package org.ies.tierno.biblioteca_oop.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.biblioteca_oop.models.Book;
import org.ies.tierno.biblioteca_oop.models.Library;

import java.util.Scanner;

@AllArgsConstructor
public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public Library read(){

        System.out.println("//Datos Biblioteca: //");
        System.out.println("Nombre: ");
        String name= scanner.nextLine();

        int numBooks;
        do {
            System.out.println("¿Cuántos libros hay en la biblioteca?");
            numBooks= scanner.nextInt();
            scanner.nextLine();
        }while (numBooks<1);

        Book[] books= new Book[numBooks];

        for (int i = 0; i < books.length; i++) {
            books[i]=bookReader.read();
        }

        return new Library(
                name,
                books);
    }
}
