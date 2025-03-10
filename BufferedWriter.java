import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferdWriter {
    public static void main(String[] args) {
        String text = "This is a text written using BufferedWriter.";
        
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputBufferedWriter.txt"))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}