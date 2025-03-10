
import java.io.FileWriter;
import java.io.IOException;

class WriteToFileUsingFileWriter6 {
    public static void main(String[] args) {
        String text = "This is a text written using FileWriter.";
        
        try (FileWriter fileWriter = new FileWriter("outputFileWriter.txt")) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}