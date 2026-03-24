package ua.university;

import java.util.*;
import java.util.function.*;
import java.time.*;

public class EventLab {

    // 1. pick
    public static List<Event> pick(List<Event> events, Predicate<Event> predicate) {
        List<Event> result = new ArrayList<>();

        for (Event e : events) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }

        return result;
    }

    // 2. labels
    public static List<String> labels(List<Event> events, Function<Event, String> function) {
        List<String> result = new ArrayList<>();

        for (Event e : events) {
            result.add(function.apply(e));
        }

        return result;
    }

    // 3. notifyAll
    public static void notifyAll(List<Event> events, Consumer<Event> consumer) {
        for (Event e : events) {
            consumer.accept(e);
        }
    }

    // 4. create
    public static Event create(Supplier<Event> supplier) {
        return supplier.get();
    }

    // 7. findConflicts
    public static List<String> findConflicts(List<Event> events) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j < events.size(); j++) {

                Event a = events.get(i);
                Event b = events.get(j);

                Instant aStart = a.getStart().atZone(a.getZone()).toInstant();
                Instant aEnd = a.end().toInstant();

                Instant bStart = b.getStart().atZone(b.getZone()).toInstant();
                Instant bEnd = b.end().toInstant();

                boolean overlap = aStart.isBefore(bEnd) && bStart.isBefore(aEnd);

                if (overlap) {
                    result.add(a.label() + " conflicts with " + b.label());
                }
            }
        }

        return result;
    }
}
