import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) {
        GridPane gridPane = new GridPane();
        setupGridPane(gridPane);

        Scene scene = new Scene(gridPane);

        mainStage.setScene(scene);
        mainStage.show();

        Game game = new Game(gridPane);
        game.start();
    }

    private void setupGridPane(GridPane gridPane) {
        gridPane.setAlignment(Pos.CENTER);
    }
}
