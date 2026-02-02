package org.ies.tierno.instituto_oop.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.instituto_oop.models.Student;

import java.util.Scanner;

@AllArgsConstructor
public class ReaderStudent {
    private final Scanner scanner;

    public Student read(){
        System.out.println("//Datos estudiante//");

        System.out.println("Nombre: ");
        String name= scanner.nextLine();

        System.out.println("Apellidos: ");
        String surname= scanner.nextLine();

        System.out.println("Dirección: ");
        String address= scanner.nextLine();

        return new Student(
                name,
                surname,
                address
        );
    }
}
