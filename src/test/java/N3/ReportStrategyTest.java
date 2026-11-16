package N3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReportStrategyTest {

    private Strategies strategies;

    @BeforeEach
    void setUp() {
        strategies = new Strategies();
    }

    @Test
    void shouldUseHtml() {
        assertThat(strategies.html.export("Texto prueba")).isEqualTo("<p>Texto prueba</p>");
    }

    @Test
    void shouldUseJson() {
        assertThat(strategies.json.export("Texto prueba")).isEqualTo("{'mensaje':Texto prueba}");
    }

    @Test
    void shouldUseXml() {
        assertThat(strategies.xml.export("Texto prueba")).isEqualTo("<texto><![CDATA[Texto prueba]]></texto>");
    }

    @Test
    void shouldUseCsv() {
        assertThat(strategies.csv.export("Texto prueba")).isEqualTo("Texto, prueba");
    }


}