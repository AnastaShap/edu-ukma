package ua.university;

import task3.Ticket;
import task3.TicketComparators;
import task4.CheckoutRequest;
import task4.Price;
import task4.UserDto;
import ua.university.task1.Car;
import ua.university.task1.Library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("--- Task 1 ---");

        Car myCar = new Car("Toyota Camry");
        Car.Engine myEngine = myCar.spec();
        System.out.println("Авто: " + myCar.getModel() + ", Потужність: " + myEngine.getHorsepower());


        Library myLibrary = new Library("Центральна міська бібліотека");
        // Створення об*єкта внутрішнього класу через об*єкт зовнішнього
        Library.Book myBook = myLibrary.new Book("1984", "Джордж Оруелл");
        System.out.print(myBook.bookLabel());

        System.out.println("\n--- Task 2 ---");

        TicketSystem system = new TicketSystem();

       String ticketId = system.buildTicketId("VIP");
        System.out.println("Згенерований ID: " + ticketId);
        Runnable task = system.runOnce();
        task.run();

        System.out.println("\n--- Task 3 ---");


        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(3, LocalDate.of(2024, Month.JUNE, 23)));
        tickets.add(new Ticket(1, LocalDate.of(2025, Month.APRIL, 7)));
        for (Ticket ticket : tickets) {
            System.out.println(ticket.getPriority());
        }
      //  Comparator<Ticket> lambdaComparator = TicketComparators.LAMBDA_COMPARATOR;
       // System.out.println("lambda" + lambdaComparator);

        TicketComparators.sortTickets(tickets, "priority");
        for (Ticket ticket : tickets) {
            System.out.println("до сортування за пріоритетом" + ticket.getPriority());
        }

        TicketComparators.sortTickets(tickets, "createdAt");
        for (Ticket ticket : tickets) {
            System.out.println("після сортування за датою : " + ticket.createdDate);
        }


    }
}
