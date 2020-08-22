package chess;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void testCreateChessBoard() {
        ChessBoard chessboard = new ChessBoard();
        assertNotNull(chessboard);
    }

    @Test
    public void testCreatePieces() {
        ChessBoard chessboard = new ChessBoard();
        String actual = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessboard.getBoard()[i][j] != null) {
                    actual += chessboard.getBoard()[i][j].toString();
                }
            }
            actual += "\n";
        }
        final String expected = "RBHBBBQBKBBBHBRB" + "\n" +
                                "pBpBpBpBpBpBpBpB" + "\n" +
                                "" + "\n" +
                                "" + "\n" +
                                "" + "\n" +
                                "" + "\n" +
                                "pWpWpWpWpWpWpWpW" + "\n" +
                                "RWHWBWQWKWBWHWRW" + "\n" ;
        assertEquals(expected, actual);
    }
}
