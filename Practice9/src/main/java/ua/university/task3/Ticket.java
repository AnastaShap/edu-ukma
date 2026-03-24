package task3;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    public int priority;
    public LocalDate createdDate;

    public Ticket(int priority, LocalDate createdDate) {
        this.priority = priority;
        this.createdDate = createdDate;
    }
    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public LocalDate getCreatedDate(){
        return createdDate;
    }
}
