package ua.university.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfoPrinter {

    public static void print(Class<?> clazz) {
        System.out.println("Class name: " + clazz.getName());

        Class<?> superClass = clazz.getSuperclass();
        System.out.println("Superclass: " + (superClass != null ? superClass.getName() : "None"));

        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println("Interfaces:");
        for (Class<?> i : interfaces) {
            System.out.println(" - " + i.getName());
        }

        Field[] books = clazz.getDeclaredFields();
        System.out.println("Fields:");
        for (Field b : books) {
            System.out.println(" - " + b.getType().getSimpleName() + " " + b.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method m : methods) {
            System.out.println(" - " + m.getReturnType().getSimpleName() + " " + m.getName());
        }
    }
}