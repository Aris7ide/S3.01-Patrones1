package N3;

import com.lowagie.text.Paragraph;

import java.nio.file.Path;

public class Strategies {

    ExportToExcel exportToExcel = new ExportToExcel();
    ExportToWord exportToWord = new ExportToWord();

    public final ReportStrategy html = text -> "<p>" + text + "</p>";
    public final ReportStrategy json = text -> "{'mensaje':" + text + "}";
    public final ReportStrategy xml = text -> "<texto><![CDATA[" +  text + "]]></texto>";
    public final ReportStrategy csv = text -> text.replace(" ",", ");
    public final ReportStrategy word = text -> exportToWord.export(text);
    public final ReportStrategy excel = text -> exportToExcel.export(text);


}
