import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Random;

public class Board {

    private static final int BOARD_SIZE = 3;
    private static final String BASE_PATH = "/secondary/Software Engineering/Jaar 2/OOP3";

    private ImageView[][] _pawns;
    private Random _random;

    public Board() {
        _random = new Random();
        _pawns = new ImageView[BOARD_SIZE][BOARD_SIZE];
    }

    public void generate() {
        Image pawn;
        ImageView imageView;

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                switch (_random.nextInt(3)) {
                    case 1:
                        pawn = new Image(new File(BASE_PATH + "/x.gif").toURI().toString());
                        break;
                    case 2:
                        pawn = new Image(new File(BASE_PATH + "/o.gif").toURI().toString());
                        break;
                    default:
                        pawn = null;
                }

                imageView = new ImageView();

                if (pawn != null)
                    imageView.setImage(pawn);

                _pawns[i][j] = imageView;
            }
        }
    }

    public ImageView[][] getPawns() {
        return _pawns;
    }
}
