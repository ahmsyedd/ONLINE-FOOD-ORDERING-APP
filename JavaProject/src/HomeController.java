import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomeController {
    @FXML
    private Label lblGreet;
    @FXML
    private Button btnBreakfast;
    @FXML
    private Button btnEntrees;
    @FXML
    private Button btnBeverages;
    @FXML
    private Button btnDesserts;
    @FXML
    private Button btnChk;
    @FXML
    private Label lblTest;
    @FXML
    private ImageView imgBeverages;
    @FXML
    private ImageView imgBreakfast;
    @FXML
    private ImageView imgDesserts;
    @FXML
    private ImageView imgEntrees;

    float amount = 0.0f;

    public void initialize() {
        imgBreakfast.setImage(new Image("images/breakfast.jpg"));
        imgEntrees.setImage(new Image("images/meal.jpg"));
        imgBeverages.setImage(new Image("images/beverages.jpg"));
        imgDesserts.setImage(new Image("images/desserts.jpg"));
    }

    @FXML
    public void dispCategory(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("Breakfast")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BreakfastPage.fxml"));
            Parent root2 = loader.load();
            BreakfastController secondWindowController = loader.getController();
            Stage stage = new Stage();
            Scene scene = new Scene(root2);
            stage.setScene(scene);
            stage.show();
            secondWindowController.addTotal(amount);
            Stage oldStage = (Stage) btnBreakfast.getScene().getWindow();
            oldStage.close();
        } else if (btn.getText().equals("Entrees")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EntreePage.fxml"));
            Parent root2 = loader.load();
            EntreeController secondWindowController = loader.getController();
            Stage stage = new Stage();
            Scene scene = new Scene(root2);
            stage.setScene(scene);
            stage.show();
            secondWindowController.addTotal(amount);
            Stage oldStage = (Stage) btnEntrees.getScene().getWindow();
            oldStage.close();
        } else if (btn.getText().equals("Beverages")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BeveragesPage.fxml"));
            Parent root2 = loader.load();
            BeveragesController secondWindowController = loader.getController();
            Stage stage = new Stage();
            Scene scene = new Scene(root2);
            stage.setScene(scene);
            stage.show();
            secondWindowController.addTotal(amount);
            Stage oldStage = (Stage) btnBeverages.getScene().getWindow();
            oldStage.close();
        } else if (btn.getText().equals("Desserts")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DessertPage.fxml"));
            Parent root2 = loader.load();
            DessertController secondWindowController = loader.getController();
            Stage stage = new Stage();
            Scene scene = new Scene(root2);
            stage.setScene(scene);
            stage.show();
            secondWindowController.addTotal(amount);
            Stage oldStage = (Stage) btnDesserts.getScene().getWindow();
            oldStage.close();
        }
    }

    @FXML
    void checkout(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutPage.fxml"));
        Parent root2 = loader.load();
        CheckoutController checkoutWindowController = loader.getController();
        Stage stage = new Stage();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
        checkoutWindowController.checkoutTotal(amount);
        Stage oldStage = (Stage) btnChk.getScene().getWindow();
        oldStage.close();
    }

    public void homeTotal(float total) {
        amount = total;
    }

}
