package ua.university;

import java.util.*;

public class LambdaRefactorLab {

    // 1. Anonymous class
    public static void sortAnonymous(List<Event> events) {
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event a, Event b) {
                return a.getStart().compareTo(b.getStart());
            }
        });
    }

    // 2. Lambda
    public static void sortLambda(List<Event> events) {
        Collections.sort(events, (a, b) ->
                a.getStart().compareTo(b.getStart())
        );
    }

    // 3. Method Reference
    public static void sortMethodRef(List<Event> events) {
        events.sort(Comparator.comparing(Event::getStart));
    }
}
