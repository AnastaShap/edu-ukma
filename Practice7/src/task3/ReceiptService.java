package task3;

import java.io.IOException;

public class ReceiptService {

    public void generate(String fileName) {
        try (ReceiptWriter writer = new ReceiptWriter(fileName)) {
            writer.writeLine("RECEIPT");
            writer.writeLine("Thanks for your order!");
            writer.writeLine("-----------------");
        }catch (IOException e){
            throw new ReceiptGenerationException("Failed to generate Receipt File",e);
        }
    }
}
