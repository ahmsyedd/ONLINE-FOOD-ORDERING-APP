import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Pizza Order application");
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        PrintWriter writer = new PrintWriter("OrderData.txt");
        writer.print("");
        writer.close();
        primaryStage.setScene(new Scene(root, 600, 577));
        primaryStage.show();
    }
}