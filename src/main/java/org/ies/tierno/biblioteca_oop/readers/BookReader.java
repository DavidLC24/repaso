package org.ies.tierno.biblioteca_oop.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.biblioteca_oop.models.Author;
import org.ies.tierno.biblioteca_oop.models.Book;

import java.util.Scanner;

@AllArgsConstructor
public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public Book read(){

        System.out.println("//Datos del libro//");

        System.out.println("ISBN: ");
        Long isbn= scanner.nextLong();
        scanner.nextLine();

        System.out.println("Título: ");
        String title= scanner.nextLine();

        System.out.println("Año: ");
        int year= scanner.nextInt();
        scanner.nextLine();

        int numAuthor;
        do {
            System.out.println("¿Cuántos autores tiene el libro?");
            numAuthor= scanner.nextInt();
            scanner.nextLine();
        } while (numAuthor<1);

        Author[] authors= new Author[numAuthor];

        for (int i = 0; i < authors.length; i++) {
            authors[i]= authorReader.read();
        }

        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}
