package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void isPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell result = bishopBlack.position();
        assertEquals(result, Cell.A1);
    }

    @Test
    public void isCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure result = bishopBlack.copy(Cell.A2);
        assertEquals(result.position(), Cell.A2);
    }

    @Test
    public void isWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        assertArrayEquals(result, new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }

    @Test (expected = ImpossibleMoveException.class)
    public void isException() throws ImpossibleMoveException {
        Figure result = new BishopBlack(Cell.H8);
        result.way(Cell.H7);
    }
}