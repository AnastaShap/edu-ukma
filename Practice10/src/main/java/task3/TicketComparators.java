package task3;

import java.util.Comparator;
import java.util.List;

public class TicketComparators {

    // using anonymous class
    public static final Comparator<Ticket> TICKET_COMPARATOR_ANONYM = new Comparator<Ticket>() {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            return Integer.compare(o1.priority, o2.priority);
        }
    };

    // using lambda
    public static final Comparator<Ticket> LAMBDA_COMPARATOR =
            (t1, t2) -> Integer.compare(t1.priority, t2.priority);

    // 3 - USING METHOD REF
    public static final Comparator<Ticket> BY_PRIORITY = Comparator.comparingInt(Ticket::getPriority);
    public static final Comparator<Ticket> BY_CREATED_AT = Comparator.comparing(Ticket::getCreatedDate);

    // combined

    public static final Comparator<Ticket> COMBINED_COMPARATOR =
            BY_PRIORITY.thenComparing(BY_CREATED_AT);


    public static void sortTickets(List<Ticket> tickets, String strategy) {
        Comparator<Ticket> comparator;

        switch (strategy) {
            case "priority":
                comparator = BY_PRIORITY;
                break;
            case "createdAt":
                comparator = BY_CREATED_AT;
                break;
            case "priorityThenCreatedAt":
                comparator = COMBINED_COMPARATOR;
                break;
            default:
                throw new IllegalArgumentException("Невідома стратегія сортування: " + strategy);
        }

        tickets.sort(comparator);
    }

}