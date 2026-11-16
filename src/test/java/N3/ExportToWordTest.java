package N3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

class ExportToWordTest {

    @Test
    void exportToWordTest(){
        ExportToWord exportToWord = new ExportToWord();
        String formatted = exportToWord.export("This text needs to be a word file");
        assertThat(formatted).isEqualTo("File saved in FormattedWord.docx");
    }

    @AfterAll
    static void tearDown() {
        File file = new File("FormattedWord.docx");
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted");
        }
    }

}