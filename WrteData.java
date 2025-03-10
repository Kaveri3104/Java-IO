package Java Basics.Java Operators.Arrays.Static.Strings.Inheritance.Abstract Class.Collections.Java IO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class WrteData {
    public static void main(String[] args) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Sheet1");
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Name");
            row.createCell(1).setCellValue("Age");
            row.createCell(2).setCellValue("City");
            
            Row row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Alice");
            row1.createCell(1).setCellValue(25);
            row1.createCell(2).setCellValue("New York");

            try (FileOutputStream fos = new FileOutputStream("output.xlsx")) {
                workbook.write(fos);
            }
            System.out.println("Excel file written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
