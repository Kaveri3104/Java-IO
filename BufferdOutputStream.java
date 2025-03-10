import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteToFileUsingBufferedOutputStream4 {
    public static void main(String[] args) {
        String text = "Hello, this is written using BufferedOutputStream.";
        
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("outputBuffered.txt"))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
