package ua.university.task2;

public class DailyReport extends ReportGenerator{

    @Override
    protected void loadData(){
        System.out.println("Loading daily data...");
    }

    @Override
    protected void formatReport(){
        System.out.println("Formatting daily report...");
    }

}
