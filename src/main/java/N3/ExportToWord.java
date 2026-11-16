package N3;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExportToWord implements ReportStrategy{

    public static String exportToWord(String content, String filePath) throws IOException {
        try (XWPFDocument document = new XWPFDocument()){

            XWPFParagraph paragraph = document.createParagraph();

            XWPFRun run = paragraph.createRun();
            run.setText(content);
            run.setFontSize(12);
            run.setFontFamily("Arial");

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                document.write(out);
                document.close();
                return "File saved in " + filePath;
            }

        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }


    @Override
    public String export(String texto)  {
        try {
            return exportToWord(texto, "FormattedWord.docx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
