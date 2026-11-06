package N3;

public interface ReportStrategy {
    String export(String texto);

    ReportStrategy html = text -> "<html>" + text + "</html>";
}
