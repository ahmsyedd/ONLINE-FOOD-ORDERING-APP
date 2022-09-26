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

public class BreakfastController {

    @FXML
    private Button btnAddBagel;
    @FXML
    private Button btnAddBurrito;
    @FXML
    private Button btnAddCheese;
    @FXML
    private Button btnAddWrap;
    @FXML
    private Button btnPlusBagel;
    @FXML
    private Button btnPlusBurrito;
    @FXML
    private Button btnPlusCheese;
    @FXML
    private Button btnPlusWrap;
    @FXML
    private Button btnRmvBagel;
    @FXML
    private Button btnRmvBurrito;
    @FXML
    private Button btnRmvCheese;
    @FXML
    private Button btnRmvWrap;
    @FXML
    private Button btnHome;
    @FXML
    private ImageView imgBagel;
    @FXML
    private ImageView imgBurrito;
    @FXML
    private ImageView imgCheese;
    @FXML
    private ImageView imgWrap;
    @FXML
    private Text txtNumBagel;
    @FXML
    private Text txtNumBurrito;
    @FXML
    private Text txtNumCheese;
    @FXML
    private Text txtNumWrap;

    private String data = "";
    private float total = 0.0f;
    File file = new File("OrderData.txt");


    public void initialize() {
        imgBagel.setImage(new Image("images/everythingbagel.jpg"));
        imgBurrito.setImage(new Image("images/BreakfastBurritos.jpg"));
        imgCheese.setImage(new Image("images/grilledcheese.jpg"));
        imgWrap.setImage(new Image("images/Chickenwrap.jpg"));
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
    void enterCheese(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumCheese.getText().isEmpty() && isNumeric(txtNumCheese.getText())
                    && Integer.valueOf(txtNumCheese.getText()) > 0) {
                txtNumCheese.setText(Integer.valueOf(txtNumCheese.getText()) - 1 + "");
            } else {
                txtNumCheese.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumCheese.getText().isEmpty() && isNumeric(txtNumCheese.getText())
                    && Integer.valueOf(txtNumCheese.getText()) >= 0) {
                txtNumCheese.setText(Integer.valueOf(txtNumCheese.getText()) + 1 + "");
            } else {
                txtNumCheese.requestFocus();
            }
        } else {
            if (!txtNumCheese.getText().isEmpty() && isNumeric(txtNumCheese.getText())
                    && Integer.valueOf(txtNumCheese.getText()) > 0) {
                total += Integer.valueOf(txtNumCheese.getText()) * 4.50;
                data = "Grilled Cheese:\t" + txtNumCheese.getText() + " items will cost $" + (Integer.valueOf(txtNumCheese.getText()) * 4.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumCheese.requestFocus();
            }
        }
    }

    @FXML
    void enterBagel(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumBagel.getText().isEmpty() && isNumeric(txtNumBagel.getText())
                    && Integer.valueOf(txtNumBagel.getText()) > 0) {
                txtNumBagel.setText(Integer.valueOf(txtNumBagel.getText()) - 1 + "");
            } else {
                txtNumBagel.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumBagel.getText().isEmpty() && isNumeric(txtNumBagel.getText())
                    && Integer.valueOf(txtNumBagel.getText()) >= 0) {
                txtNumBagel.setText(Integer.valueOf(txtNumBagel.getText()) + 1 + "");
            } else {
                txtNumBagel.requestFocus();
            }
        } else {
            if (!txtNumBagel.getText().isEmpty() && isNumeric(txtNumBagel.getText())
                    && Integer.valueOf(txtNumBagel.getText()) > 0) {
                total += Integer.valueOf(txtNumBagel.getText()) * 6.50;
                data = "Everything Bagel:\t" + txtNumBagel.getText() + " items will cost $" + (Integer.valueOf(txtNumBagel.getText()) * 6.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumBagel.requestFocus();
            }
        }
    }

    @FXML
    void enterWrap(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumWrap.getText().isEmpty() && isNumeric(txtNumWrap.getText())
                    && Integer.valueOf(txtNumWrap.getText()) > 0) {
                txtNumWrap.setText(Integer.valueOf(txtNumWrap.getText()) - 1 + "");
            } else {
                txtNumWrap.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumWrap.getText().isEmpty() && isNumeric(txtNumWrap.getText())
                    && Integer.valueOf(txtNumWrap.getText()) >= 0) {
                txtNumWrap.setText(Integer.valueOf(txtNumWrap.getText()) + 1 + "");
            } else {
                txtNumWrap.requestFocus();
            }
        } else {
            if (!txtNumWrap.getText().isEmpty() && isNumeric(txtNumWrap.getText())
                    && Integer.valueOf(txtNumWrap.getText()) > 0) {
                total += Integer.valueOf(txtNumWrap.getText()) * 6.50;
                data = "Chicken Wrep:\t" + txtNumWrap.getText() + " items will cost $" + (Integer.valueOf(txtNumWrap.getText()) * 6.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumWrap.requestFocus();
            }
        }
    }

    @FXML
    void enterBurrito(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumBurrito.getText().isEmpty() && isNumeric(txtNumBurrito.getText())
                    && Integer.valueOf(txtNumBurrito.getText()) > 0) {
                txtNumBurrito.setText(Integer.valueOf(txtNumBurrito.getText()) - 1 + "");
            } else {
                txtNumBurrito.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumBurrito.getText().isEmpty() && isNumeric(txtNumBurrito.getText())
                    && Integer.valueOf(txtNumBurrito.getText()) >= 0) {
                txtNumBurrito.setText(Integer.valueOf(txtNumBurrito.getText()) + 1 + "");
            } else {
                txtNumBurrito.requestFocus();
            }
        } else {
            if (!txtNumBurrito.getText().isEmpty() && isNumeric(txtNumBurrito.getText())
                    && Integer.valueOf(txtNumBurrito.getText()) > 0) {
                total += Integer.valueOf(txtNumBurrito.getText()) * 6.50;
                data = "Breakfast Burrito:\t" + txtNumBurrito.getText() + " items will cost $" + (Integer.valueOf(txtNumBurrito.getText()) * 6.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumBurrito.requestFocus();
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