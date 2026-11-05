package N1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    Undo undo;

    @BeforeEach
    void setUp() {
        undo = Undo.getInstance();

        undo.addCommand("Love");
        undo.addCommand("Fizz");
        undo.addCommand("Buzz");
    }

    @Test
    void shouldOnlyAllowOneInstance() {
        Undo undo2 = Undo.getInstance();
        assertThat(undo2).isEqualTo(undo);
    }

    @Test
    void shouldAddCommands() {
        assertThat(undo.showHistory()).size().isEqualTo(3);
    }

    @Test
    void shouldUndo() {
        undo.undoCommand();
        assertThat(undo.showHistory()).size().isEqualTo(2);
        assertThat(undo.showHistory()).containsExactly("Love", "Fizz");
    }

    @Test
    void shouldBeTheSameUndo() {
        Undo undo4 = Undo.getInstance();

        undo4.addCommand("Tree");

        assertThat(undo.showHistory()).size().isEqualTo(4);
    }
}