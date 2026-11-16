package N3;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExportToExcel implements ReportStrategy{

    public static String exportStringToExcel(String content, String filePath){
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);

        cell.setCellValue(content);

        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);
        cell.setCellStyle(style);

        try (FileOutputStream file = new FileOutputStream(filePath)) {
            workbook.write(file);
            workbook.close();
            return "File created successfully in " + filePath;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String export(String texto) {
        return exportStringToExcel(texto, "reporte.xlsx");
    }
}
