import java.io.FileInputStream;

public class ReadDatafrmExcel {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.xlsx")) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


