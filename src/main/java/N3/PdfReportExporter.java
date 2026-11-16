package N3;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class PdfReportExporter {
    public static void exportStringToPdf(String textContent, Path destinationPath) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(destinationPath.toFile()));

            document.open();
            document.add(new Paragraph(textContent));

            System.out.println("PDF exportado correctamente en: " + destinationPath.toAbsolutePath());

        } catch (DocumentException | IOException e) {
            System.err.println("Error al generar el PDF: " + e.getMessage());
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    }
}
