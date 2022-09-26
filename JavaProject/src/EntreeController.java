import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EntreeController {

    @FXML
    private Button btnAddBurger;
    @FXML
    private Button btnAddChow;
    @FXML
    private Button btnAddPizza;
    @FXML
    private Button btnAddWings;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnPlusBurger;
    @FXML
    private Button btnPlusChow;
    @FXML
    private Button btnPlusPizaa;
    @FXML
    private Button btnPlusWings;
    @FXML
    private Button btnRmvBurger;
    @FXML
    private Button btnRmvChow;
    @FXML
    private Button btnRmvPizza;
    @FXML
    private Button btnRmvWings;
    @FXML
    private ImageView imgBurger;
    @FXML
    private ImageView imgChow;
    @FXML
    private ImageView imgPizza;
    @FXML
    private ImageView imgWings;
    @FXML
    private Text txtNumChow;
    @FXML
    private Text txtNumBurger;
    @FXML
    private Text txtNumPizza;
    @FXML
    private Text txtNumWings;

    private String data = "";
    private float total = 0.0f;
    File file = new File("OrderData.txt");

    public void initialize() {
        imgBurger.setImage(new Image("images/ChickenBurger.jpg"));
        imgChow.setImage(new Image("images/vegchowmein.jpg"));
        imgPizza.setImage(new Image("images/PEP.jpg"));
        imgWings.setImage(new Image("images/chickenwings.jpg"));
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int intNum = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @FXML
    void enterBurger(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumBurger.getText().isEmpty() && isNumeric(txtNumBurger.getText())
                    && Integer.valueOf(txtNumBurger.getText()) > 0) {
                txtNumBurger.setText(Integer.valueOf(txtNumBurger.getText()) - 1 + "");
            } else {
                txtNumBurger.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumBurger.getText().isEmpty() && isNumeric(txtNumBurger.getText())
                    && Integer.valueOf(txtNumBurger.getText()) >= 0) {
                txtNumBurger.setText(Integer.valueOf(txtNumBurger.getText()) + 1 + "");
            } else {
                txtNumBurger.requestFocus();
            }
        } else {
            if (!txtNumBurger.getText().isEmpty() && isNumeric(txtNumBurger.getText())
                    && Integer.valueOf(txtNumBurger.getText()) > 0) {
                total += Integer.valueOf(txtNumBurger.getText()) * 8.50;
                data = "Chicken Burger:\t" + txtNumBurger.getText() + " items will cost $" + (Integer.valueOf(txtNumBurger.getText()) * 8.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumBurger.requestFocus();
            }
        }
    }

    @FXML
    void enterChow(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumChow.getText().isEmpty() && isNumeric(txtNumChow.getText())
                    && Integer.valueOf(txtNumChow.getText()) > 0) {
                txtNumChow.setText(Integer.valueOf(txtNumChow.getText()) - 1 + "");
            } else {
                txtNumChow.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumChow.getText().isEmpty() && isNumeric(txtNumChow.getText())
                    && Integer.valueOf(txtNumChow.getText()) >= 0) {
                txtNumChow.setText(Integer.valueOf(txtNumChow.getText()) + 1 + "");
            } else {
                txtNumChow.requestFocus();
            }
        } else {
            if (!txtNumChow.getText().isEmpty() && isNumeric(txtNumChow.getText())
                    && Integer.valueOf(txtNumChow.getText()) > 0) {
                total += Integer.valueOf(txtNumChow.getText()) * 16.50;
                data = "Vegetable Chowmein:\t" + txtNumChow.getText() + " items will cost $" + (Integer.valueOf(txtNumChow.getText()) * 16.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumChow.requestFocus();
            }
        }
    }

    @FXML
    void enterPizza(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumPizza.getText().isEmpty() && isNumeric(txtNumPizza.getText())
                    && Integer.valueOf(txtNumPizza.getText()) > 0) {
                txtNumPizza.setText(Integer.valueOf(txtNumPizza.getText()) - 1 + "");
            } else {
                txtNumPizza.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumPizza.getText().isEmpty() && isNumeric(txtNumPizza.getText())
                    && Integer.valueOf(txtNumPizza.getText()) >= 0) {
                txtNumPizza.setText(Integer.valueOf(txtNumPizza.getText()) + 1 + "");
            } else {
                txtNumPizza.requestFocus();
            }
        } else {
            if (!txtNumPizza.getText().isEmpty() && isNumeric(txtNumPizza.getText())
                    && Integer.valueOf(txtNumPizza.getText()) > 0) {
                total += Integer.valueOf(txtNumPizza.getText()) * 10.50;
                data = "Pepperoni Pizaa:\t" + txtNumPizza.getText() + " items will cost $" + (Integer.valueOf(txtNumPizza.getText()) * 10.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumPizza.requestFocus();
            }
        }
    }

    @FXML
    void enterWings(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumWings.getText().isEmpty() && isNumeric(txtNumWings.getText())
                    && Integer.valueOf(txtNumWings.getText()) > 0) {
                txtNumWings.setText(Integer.valueOf(txtNumWings.getText()) - 1 + "");
            } else {
                txtNumWings.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumWings.getText().isEmpty() && isNumeric(txtNumWings.getText())
                    && Integer.valueOf(txtNumWings.getText()) >= 0) {
                txtNumWings.setText(Integer.valueOf(txtNumWings.getText()) + 1 + "");
            } else {
                txtNumWings.requestFocus();
            }
        } else {
            if (!txtNumWings.getText().isEmpty() && isNumeric(txtNumWings.getText())
                    && Integer.valueOf(txtNumWings.getText()) > 0) {
                total += Integer.valueOf(txtNumWings.getText()) * 12.50;
                data = "Chicken Wings:\t" + txtNumWings.getText() + " items will cost $" + (Integer.valueOf(txtNumWings.getText()) * 12.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumWings.requestFocus();
            }
        }

    }

    @FXML
    void backHome(ActionEvent event) throws IOException {
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root2 = homeLoader.load();
        HomeController homeWindowController = homeLoader.getController();
        Stage stage = new Stage();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
        homeWindowController.homeTotal(total);
        Stage oldStage = (Stage) btnHome.getScene().getWindow();
        oldStage.close();
    }

    public void addTotal(float total) {
        this.total = total;
    }

}
