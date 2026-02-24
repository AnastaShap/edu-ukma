package ua.university.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger implements Logger{
    private final String name;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public SimpleLogger(String name) {
        this.name = name;
    }
    @Override
    public void info(String msg, Object... args) {
        log("INFO", msg, args);
    }

    @Override
    public void warn(String msg, Object... args) {
        log("WARN", msg, args);
    }

    @Override
    public void error(String msg, Object... args) {
        log("ERROR", msg, args);
    }

    private void log(String level, String msg, Object... args) {
        String formattedMessage = format(msg, args);
        System.out.println(String.format("%s [%s] %s - %s", LocalDateTime.now().format(formatter), level, name, formattedMessage));
    }

    private String format(String msg, Object... args) {
        if (args == null || args.length == 0) return msg;

        for (Object arg : args) {
            msg = msg.replaceFirst("\\{\\}", arg == null ? "null" : arg.toString());
        }
        return msg;
    }
}
