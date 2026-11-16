package N3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExportToExcelTest {

    @Test
    void shouldGenerateExcel() {
        ExportToExcel exportToExcel = new ExportToExcel();
        String exported = exportToExcel.export("Text to test with the excel");
        assertThat(exported).isNotBlank();
    }

    @AfterAll
    static void shouldCancelTest() {
        File excel = new File("reporte.xlsx");
        if (excel.exists()) {
            excel.delete();
            System.out.println("File deleted");
        }
    }

}