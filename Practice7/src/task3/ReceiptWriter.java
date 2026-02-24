package task3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptWriter implements AutoCloseable{

    private final PrintWriter writer;

    public ReceiptWriter(String fileName) throws IOException {
        this.writer = new PrintWriter(new FileWriter(fileName));
    }

    public void writeLine(String line) {
        writer.println(line);
    }

    @Override
    public void close() throws IOException {
        writer.close();
        System.out.println("ReceiptWriter has been closed");
    }
}
