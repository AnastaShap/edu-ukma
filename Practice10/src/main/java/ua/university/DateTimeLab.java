package ua.university;

import java.time.*;

public class DateTimeLab {

    // LocalDateTime + ZoneId → ZonedDateTime → Instant
    public static Instant toInstant(Event e) {
        return e.getStart()
                .atZone(e.getZone())
                .toInstant();
    }

    /*
    * різниця через Instant не через LocalDateTime
* */
    public static long minutesBetween(Event a, Event b) {
        Instant aStart = toInstant(a);
        Instant bStart = toInstant(b);

        return Duration.between(aStart, bStart).toMinutes();
    }

    ///  withZoneSameInstant → той самий момент часу, інша зона
    public static ZonedDateTime startInZone(Event e, String zone) {
        return e.getStart()
                .atZone(e.getZone())
                .withZoneSameInstant(ZoneId.of(zone));
    }

        /*
        * Якщо коротко:

            LocalDateTime → “час без світу”
            ZonedDateTime → “час + місце”
            Instant → “абсолютний час (UTC)”
            * */
}
