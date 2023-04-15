package chess;

import boardgame.Board;
import boardgame.Piece;
import lombok.Getter;

@Getter
public class ChessPiece extends Piece {

    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
