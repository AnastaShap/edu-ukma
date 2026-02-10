package ua.university.task2;

public abstract class ReportGenerator {
    public final void generate() {
        loadData();
        formatReport();
        saveReport();
    }

    protected void saveReport() {
        System.out.println("Report generated and saved.");
    }

    protected abstract void formatReport();

    protected abstract void loadData();
}
