package ua.university;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Event {

    private String title;
    private LocalDateTime start;
    private int durationMinutes;
    private ZoneId zone;
    private String track;

    public Event(String title, LocalDateTime start, int durationMinutes, ZoneId zone, String track) {
        this.title = title;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.zone = zone;
        this.track = track;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public ZoneId getZone() {
        return zone;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getTrack() {
        return track;
    }

    // 2. Час завершення
    public ZonedDateTime end() {
        return start.atZone(zone).plusMinutes(durationMinutes);
    }

    // 3. Label
    public String label() {
        return title + " [" + track + "]";
    }
}