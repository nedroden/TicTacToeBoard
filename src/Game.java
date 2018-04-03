import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Game {

    private GridPane _gridPane;
    private Board _board;

    public Game(GridPane gridPane) {
        _gridPane = gridPane;
        _board = new Board();
        _board.generate();
    }

    public void start() {
        _board.generate();
        ImageView[][] pawns = _board.getPawns();

        for (int i = 0; i < pawns.length; i++)
            for (int j = 0; j < pawns[i].length; j++)
                if (pawns[i][j] != null)
                    _gridPane.add(pawns[i][j], i, j);
    }
}
