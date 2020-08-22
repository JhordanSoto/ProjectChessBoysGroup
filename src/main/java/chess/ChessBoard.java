package chess;

public class ChessBoard {
    private Piece[][] board;
    static final int CHESSBOARD_SIZE = 8;
    static final int POSITION_ZERO = 0;
    static final int POSITION_ONE = 1;
    static final int POSITION_TWO = 2;
    static final int POSITION_THREE = 3;
    static final int POSITION_FOUR = 4;
    static final int POSITION_FIVE = 5;
    static final int POSITION_SIX = 6;
    static final int POSITION_SEVEN = 7;

    public ChessBoard() {
        board = new  Piece[CHESSBOARD_SIZE][CHESSBOARD_SIZE];
        createPieces();
    }
    public ChessBoard(final Piece piece) {
        board = new  Piece[CHESSBOARD_SIZE][CHESSBOARD_SIZE];
        board[piece.getPosition().getColumn()][piece.getPosition().getRow()] = piece;
    }
    /**create the cheassboard without piecese**/
    public void crateAnEmptyChessBoard() {
        board = new  Piece[CHESSBOARD_SIZE][CHESSBOARD_SIZE];
    }

    /**add a new piece to the board the purpose of test**/
    public void addPiece(final Piece piece) {
        board[piece.getPosition().getColumn()][piece.getPosition().getRow()] = piece;
    }

    /**
     *
     * @return board of ChessBoard
     *
     * **/
    public Piece[][] getBoard() {
        return this.board;
    }

    /**method to move a piece**/
   /* public void move2(final Position p, final Piece piece) {
        board[p.getColumn()][p.getRow()] = piece;
    }*/

    /**Method that creates the pieces**/
    public void createPieces() {
        createPawns();
        createRooks();
        createHorses();
        createBishops();
        createQueens();
        createKings();
    }

    private void createPawns() {
        for (int row = 0; row < CHESSBOARD_SIZE; row++) {
            Position posBlack = new Position(POSITION_ONE, row);
            board[POSITION_ONE][row] = new Pawn(Color.BLACK, posBlack);
            Position posWhite = new Position(POSITION_SIX, row);
            board[POSITION_SIX][row] = new Pawn(Color.WHITE, posWhite);
        }
    }

    private void createRooks() {
        Position posBLRook = new Position(POSITION_ZERO, POSITION_ZERO);
        Position posBRRook = new Position(POSITION_ZERO, POSITION_SEVEN);
        Position posWLRook = new Position(POSITION_SEVEN, POSITION_ZERO);
        Position posWRRook = new Position(POSITION_SEVEN, POSITION_SEVEN);
        board[POSITION_ZERO][POSITION_ZERO] = new Rook(Color.BLACK, posBLRook, this);
        board[POSITION_ZERO][POSITION_SEVEN] = new Rook(Color.BLACK, posBRRook, this);
        board[POSITION_SEVEN][POSITION_ZERO] = new Rook(Color.WHITE, posWLRook, this);
        board[POSITION_SEVEN][POSITION_SEVEN] = new Rook(Color.WHITE, posWRRook, this);
    }

    private void createHorses() {
        Position posBLHorse = new Position(POSITION_ZERO, POSITION_ONE);
        Position posBRHorse = new Position(POSITION_ZERO, POSITION_SIX);
        Position posWLHorse = new Position(POSITION_SEVEN, POSITION_ONE);
        Position posWRHorse = new Position(POSITION_SEVEN, POSITION_SIX);
        board[POSITION_ZERO][POSITION_ONE] = new Horse(Color.BLACK, posBLHorse, this);
        board[POSITION_ZERO][POSITION_SIX] = new Horse(Color.BLACK, posBRHorse, this);
        board[POSITION_SEVEN][POSITION_ONE] = new Horse(Color.WHITE, posWLHorse, this);
        board[POSITION_SEVEN][POSITION_SIX] = new Horse(Color.WHITE, posWRHorse, this);
    }

    private void createBishops() {
        Position posBLBishop = new Position(POSITION_ZERO, POSITION_TWO);
        Position posBRBishop = new Position(POSITION_ZERO, POSITION_FIVE);
        Position posWLBishop = new Position(POSITION_SEVEN, POSITION_TWO);
        Position posWRBishop = new Position(POSITION_SEVEN, POSITION_FIVE);
        board[POSITION_ZERO][POSITION_TWO] = new Bishop(Color.BLACK, posBLBishop, this);
        board[POSITION_ZERO][POSITION_FIVE] = new Bishop(Color.BLACK, posBRBishop, this);
        board[POSITION_SEVEN][POSITION_TWO] = new Bishop(Color.WHITE, posWLBishop, this);
        board[POSITION_SEVEN][POSITION_FIVE] = new Bishop(Color.WHITE, posWRBishop, this);
    }

    private void createQueens() {
        Position posBQueen = new Position(POSITION_ZERO, POSITION_THREE);
        Position posWQueen = new Position(POSITION_SEVEN, POSITION_THREE);
        board[POSITION_ZERO][POSITION_THREE] = new Queen(Color.BLACK, posBQueen, this);
        board[POSITION_SEVEN][POSITION_THREE] = new Queen(Color.WHITE, posWQueen, this);
    }

    private void createKings() {
        Position posBKing = new Position(POSITION_ZERO, POSITION_FOUR);
        Position posWKing = new Position(POSITION_SEVEN, POSITION_FOUR);
        board[POSITION_ZERO][POSITION_FOUR] = new King(Color.BLACK, posBKing);
        board[POSITION_SEVEN][POSITION_FOUR] = new King(Color.WHITE, posWKing);
    }
}
