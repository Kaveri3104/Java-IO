
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFromFileUsingBufferedReader7 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}