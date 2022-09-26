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

public class DessertController {

    @FXML
    private Button btnAddCake;
    @FXML
    private Button btnAddDonut;
    @FXML
    private Button btnAddIce;
    @FXML
    private Button btnAddMuffin;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnPlusCake;
    @FXML
    private Button btnPlusDonut;
    @FXML
    private Button btnPlusIce;
    @FXML
    private Button btnPlusMuffin;
    @FXML
    private Button btnRmvCake;
    @FXML
    private Button btnRmvDonut;
    @FXML
    private Button btnRmvIce;
    @FXML
    private Button btnRmvMuffin;
    @FXML
    private ImageView imgCake;
    @FXML
    private ImageView imgDonut;
    @FXML
    private ImageView imgIce;
    @FXML
    private ImageView imgMuffin;
    @FXML
    private Text txtNumCake;
    @FXML
    private Text txtNumDonut;
    @FXML
    private Text txtNumIce;
    @FXML
    private Text txtNumMuffin;

    private String data = "";
    private float total = 0.0f;
    File file = new File("OrderData.txt");

    public float getTotal() {
        return total;
    }

    public void initialize() {
        imgCake.setImage(new Image("images/cheesecake.jpg"));
        imgDonut.setImage(new Image("images/Donut.jpg"));
        imgIce.setImage(new Image("images/IceCream.jpg"));
        imgMuffin.setImage(new Image("images/CarrotMuffin.jpg"));
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
    void enterCake(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumCake.getText().isEmpty() && isNumeric(txtNumCake.getText())
                    && Integer.valueOf(txtNumCake.getText()) > 0) {
                txtNumCake.setText(Integer.valueOf(txtNumCake.getText()) - 1 + "");
            } else {
                txtNumCake.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumCake.getText().isEmpty() && isNumeric(txtNumCake.getText())
                    && Integer.valueOf(txtNumCake.getText()) >= 0) {
                txtNumCake.setText(Integer.valueOf(txtNumCake.getText()) + 1 + "");
            } else {
                txtNumCake.requestFocus();
            }
        } else {
            if (!txtNumCake.getText().isEmpty() && isNumeric(txtNumCake.getText())
                    && Integer.valueOf(txtNumCake.getText()) > 0) {
                total += Integer.valueOf(txtNumCake.getText()) * 6.00;
                data = "Cheesecake: \t\t" + txtNumCake.getText() + " items will cost $" + (Integer.valueOf(txtNumCake.getText()) * 6.00);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumCake.requestFocus();
            }
        }
    }

    @FXML
    void enterDonut(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumDonut.getText().isEmpty() && isNumeric(txtNumDonut.getText())
                    && Integer.valueOf(txtNumDonut.getText()) > 0) {
                txtNumDonut.setText(Integer.valueOf(txtNumDonut.getText()) - 1 + "");
            } else {
                txtNumDonut.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumDonut.getText().isEmpty() && isNumeric(txtNumDonut.getText())
                    && Integer.valueOf(txtNumDonut.getText()) >= 0) {
                txtNumDonut.setText(Integer.valueOf(txtNumDonut.getText()) + 1 + "");
            } else {
                txtNumDonut.requestFocus();
            }
        } else {
            if (!txtNumDonut.getText().isEmpty() && isNumeric(txtNumDonut.getText())
                    && Integer.valueOf(txtNumDonut.getText()) > 0) {
                total += Integer.valueOf(txtNumDonut.getText()) * 2.50;
                data = "Sprinkle Donut: \t" + txtNumDonut.getText() + " items will cost $" + (Integer.valueOf(txtNumDonut.getText()) * 2.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumDonut.requestFocus();
            }
        }
    }

    @FXML
    void enterIce(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumIce.getText().isEmpty() && isNumeric(txtNumIce.getText())
                    && Integer.valueOf(txtNumIce.getText()) > 0) {
                txtNumIce.setText(Integer.valueOf(txtNumIce.getText()) - 1 + "");
            } else {
                txtNumIce.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumIce.getText().isEmpty() && isNumeric(txtNumIce.getText())
                    && Integer.valueOf(txtNumIce.getText()) >= 0) {
                txtNumIce.setText(Integer.valueOf(txtNumIce.getText()) + 1 + "");
            } else {
                txtNumIce.requestFocus();
            }
        } else {
            if (!txtNumIce.getText().isEmpty() && isNumeric(txtNumIce.getText())
                    && Integer.valueOf(txtNumIce.getText()) > 0) {
                total += Integer.valueOf(txtNumIce.getText()) * 3.00;
                data = "Vanilla Ice Cream: \t" + txtNumIce.getText() + " items will cost $" + (Integer.valueOf(txtNumIce.getText()) * 3.00);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumIce.requestFocus();
            }
        }
    }

    @FXML
    void enterMuffin(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumMuffin.getText().isEmpty() && isNumeric(txtNumMuffin.getText())
                    && Integer.valueOf(txtNumMuffin.getText()) > 0) {
                txtNumMuffin.setText(Integer.valueOf(txtNumMuffin.getText()) - 1 + "");
            } else {
                txtNumMuffin.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumMuffin.getText().isEmpty() && isNumeric(txtNumMuffin.getText())
                    && Integer.valueOf(txtNumMuffin.getText()) >= 0) {
                txtNumMuffin.setText(Integer.valueOf(txtNumMuffin.getText()) + 1 + "");
            } else {
                txtNumMuffin.requestFocus();
            }
        } else {
            if (!txtNumMuffin.getText().isEmpty() && isNumeric(txtNumMuffin.getText())
                    && Integer.valueOf(txtNumMuffin.getText()) > 0) {
                total += Integer.valueOf(txtNumMuffin.getText()) * 3.00;
                data = "Carrot Muffin: \t" + txtNumMuffin.getText() + " items will cost $" + (Integer.valueOf(txtNumMuffin.getText()) * 3.00);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumMuffin.requestFocus();
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
