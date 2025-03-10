import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class ReadFromFileUsingBufferedInputStream3 {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"))) {
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}