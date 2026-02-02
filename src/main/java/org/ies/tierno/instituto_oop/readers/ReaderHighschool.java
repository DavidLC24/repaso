package org.ies.tierno.instituto_oop.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.instituto_oop.models.Highschool;
import org.ies.tierno.instituto_oop.models.Student;

import java.util.Scanner;

@AllArgsConstructor
public class ReaderHighschool {

    private final Scanner scanner;
    private final ReaderStudent readerStudent;

    public Highschool read(){

        System.out.println("//Datos Colegio//");

        System.out.println("Nombre: ");
        String name= scanner.nextLine();

        int numStudents;
        do {
            System.out.println("¿Cuántos estudiantes hay en el colegio?");
            numStudents= scanner.nextInt();
            scanner.nextLine();
        }while (numStudents<1);

        Student[] students= new Student[numStudents];

        for (int i = 0; i < students.length; i++) {
            students[i]= readerStudent.read();
        }

        return new Highschool(
                name,
                students
        );
    }
}
