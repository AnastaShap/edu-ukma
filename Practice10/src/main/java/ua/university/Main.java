package ua.university;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Event e1 = new Event(
                "Java Basics",
                LocalDateTime.of(2026, 3, 25, 9, 0),
                60,
                ZoneId.of("Europe/Kyiv"),
                "Backend"
        );

        Event e2 = new Event(
                "Lambda Deep Dive",
                LocalDateTime.of(2026, 3, 25, 11, 0),
                90,
                ZoneId.of("Europe/Kyiv"),
                "Advanced"
        );

        Event e3 = new Event(
                "System Design",
                LocalDateTime.of(2026, 3, 25, 14, 0),
                120,
                ZoneId.of("Europe/London"),
                "Architecture"
        );

        Event e4 = new Event(
                "Networking",
                LocalDateTime.of(2026, 3, 25, 16, 0),
                45,
                ZoneId.of("Europe/Kyiv"),
                "Infra"
        );

        System.out.println(e1.label());
        System.out.println(e2.label());

        System.out.println("End of e1: " + e1.end());
        System.out.println("End of e3: " + e3.end());

        // ----------------------------------

        System.out.println("\n--- TASK2 ---");

        // PREDICATES
        Predicate<Event> morning = e ->
                e.getStart().getHour() < 12;

        Predicate<Event> longEvent = e -> e.getDurationMinutes() > 60;
        Predicate<Event> kyivZone = e ->
                e.getZone().getId().equals("Europe/Kyiv");

        Predicate<Event> complexFilter =  morning.and(longEvent).and(kyivZone);

        Predicate<Event> notInfra = e -> !e.getTrack().equals("Infra");

        Predicate<Event> filter = morning.and(notInfra);
        List<Event> events = List.of(e1, e2, e3, e4);

        // filter
        List<Event> morningEvents = EventLab.pick(events, morning);

        // labels
        List<String> labels = EventLab.labels(events, Event::label);

        // notify
        EventLab.notifyAll(events, e ->
                System.out.println("Notify: " + e.label())
        );

            // create
        Event newEvent = EventLab.create(() ->
                new Event(
                        "New Event",
                        e1.getStart(),
                        30,
                        e1.getZone(),
                        "Test"
                )
        );

        // conflicts
        List<String> conflicts = EventLab.findConflicts(events);
        conflicts.forEach(System.out::println);

        System.out.println("\n---------------------");
        System.out.println("\n--- TASK3 ---");

        List<Event> events2 = new ArrayList<>(List.of(e1, e2, e3, e4));

        LambdaRefactorLab.sortAnonymous(events2);
        events.forEach(e -> System.out.println(e.label()));

        LambdaRefactorLab.sortLambda(events2);
        events.forEach(e -> System.out.println(e.label()));

        LambdaRefactorLab.sortMethodRef(events2);
        events.forEach(e -> System.out.println(e.label()));

        System.out.println("\n-------------------");
        System.out.println("\n--- TASK4 ---");

        System.out.println("Instant e1: " + DateTimeLab.toInstant(e1));
        System.out.println("Minutes between e1 and e2: " + DateTimeLab.minutesBetween(e1, e2));

        System.out.println("e1 in London: " + DateTimeLab.startInZone(e1, "Europe/London"));

    }
}
