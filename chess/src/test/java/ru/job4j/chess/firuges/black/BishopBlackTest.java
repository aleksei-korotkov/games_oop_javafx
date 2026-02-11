package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {
    @Test
    void whenCreateA1ThenPositionA1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(Cell.A1).isEqualTo(bishopBlack.position());
    }

    @Test
    void whenCreateC8AndCopyD7ThenPositionD7() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(Cell.D7).isEqualTo(bishopBlack.copy(Cell.D7).position());
    }

    @Test
    void whenWayG5ThenD2AndE3AndF4AndG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = bishopBlack.way(Cell.G5);
        Cell[] stepsTest = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps).isEqualTo(stepsTest);
    }
}