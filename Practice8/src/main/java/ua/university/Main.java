package ua.university;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentRegistry registry = new StudentRegistry();

        Student s1 = new Student("1", "Anna", "ann_00@mail.com");
        Student s2 = new Student("2", "Sasha", "sssash@mail.com");
        Student s3 = new Student("3", "Ivan", "ivaaan@mail.com"); // дубль email

        System.out.println("Add student 1: " + registry.addStudent(s1)); // true
        System.out.println("Add student 2: " + registry.addStudent(s2));   // true
        System.out.println("Add student 3 (duplicate email): " + registry.addStudent(s3)); // false

        System.out.println("Registry before removal: " + registry.getAllStudents());

        registry.removeById("1");
        System.out.println("Registry after removal: " + registry.getAllStudents());

        System.out.println("Add student 3(Ivan) again: " + registry.addStudent(s3)); // тепер true
        System.out.println("Registry final: " + registry.getAllStudents());

        // Task 4
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println("HashSet size: " + set.size());
        System.out.println("HashSet contents: " + set);
    }
}
