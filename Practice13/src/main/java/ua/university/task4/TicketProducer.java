package ua.university.task4;

public class TicketProducer implements Runnable {
    private final TicketQueue queue;
    private final int consumers;

    public TicketProducer(TicketQueue queue, int consumers) {
        this.queue = queue;
        this.consumers = consumers;
    }

    @Override
    public void run() {

        try {
            queue.put(new SupportTicket(1, "Costumer1", "Billing"));
            queue.put(new SupportTicket(2, "Costumer2", "Tech"));
            queue.put(new SupportTicket(3, "Costumer3", "Billing"));

            //має надіслати POISON_PILL на кожного consumer, щоб усі гарантовано завершилися(щоб вийти)
            for (int i = 0; i < consumers; i++)
                queue.put(TicketQueue.POISON_PILL);

        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
