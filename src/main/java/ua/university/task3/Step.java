package ua.university.task3;

import java.lang.annotation.Retention;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Step {
    int order();
}
