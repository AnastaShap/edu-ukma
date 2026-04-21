package ua.university.task3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.lang.reflect.AccessibleObject.setAccessible;

public class StepRunner {

    public static void run(Object target) {
        Method[] methods = target.getClass().getDeclaredMethods();
        List<Method> steps = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Step.class)) {
              //  Step step = m.getAnnotation(Step.class);
                // check signature of step‑methods
                if(m.getParameterCount() != 0 || m.getReturnType() != void.class){
                    throw new StepExecutionException("Invalid step method" + m.getName());
                }

                steps.add(m);

            }
        }

        // сортування по order
        steps.sort(Comparator.comparingInt(m -> m.getAnnotation(Step.class).order()));

        // виконання
        for(Method s : steps){
            try{
                s.setAccessible(true);
                s.invoke(target);

            }catch(Exception e){
                throw new StepExecutionException(e.getMessage());
            }
        }

        
    }

}
