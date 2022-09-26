import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ThankController {

    @FXML
    private Button btnHome;
    @FXML
    private Label lblID;

    public void initialize() {
        Random random = new Random();
        lblID.setText("#"+random.nextInt(100000));
    }
    @FXML
    void backHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root2 = loader.load();
        HomeController secondWindowController = loader.getController();
        Stage stage = new Stage();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
        Stage oldStage = (Stage) btnHome.getScene().getWindow();
        oldStage.close();
    }

}