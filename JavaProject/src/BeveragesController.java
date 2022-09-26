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

public class BeveragesController {

    @FXML
    private Button btnAddBurrito;
    @FXML
    private Button btnAddCoffee;
    @FXML
    private Button btnAddCoke;
    @FXML
    private Button btnAddWater;
    @FXML
    private Button btnPlusCoffee;
    @FXML
    private Button btnPlusCoke;
    @FXML
    private Button btnPlusLemonade;
    @FXML
    private Button btnPlusWater;
    @FXML
    private Button btnRmvCoffee;
    @FXML
    private Button btnRmvCoke;
    @FXML
    private Button btnRmvLemonade;
    @FXML
    private Button btnRmvWater;
    @FXML
    private Button btnHome;
    @FXML
    private ImageView imgCoffee;
    @FXML
    private ImageView imgCoke;
    @FXML
    private ImageView imgLemonade;
    @FXML
    private ImageView imgWater;
    @FXML
    private Text txtNumCoke;
    @FXML
    private Text txtNumCoffee;
    @FXML
    private Text txtNumWater;
    @FXML
    private Text txtNumLemonade;

    private String data = "";
    private float total = 0.0f;
    File file = new File("OrderData.txt");

    public float getTotal() {
        return total;
    }

    public void initialize() {
        imgCoffee.setImage(new Image("images/IcedCoffee.jpg"));
        imgCoke.setImage(new Image("images/Coke.jpg"));
        imgLemonade.setImage(new Image("images/Lemonade.jpg"));
        imgWater.setImage(new Image("images/Water.jpg"));
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
    void enterCoffee(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumCoffee.getText().isEmpty() && isNumeric(txtNumCoffee.getText())
                    && Integer.valueOf(txtNumCoffee.getText()) > 0) {
                txtNumCoffee.setText(Integer.valueOf(txtNumCoffee.getText()) - 1 + "");
            } else {
                txtNumCoffee.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumCoffee.getText().isEmpty() && isNumeric(txtNumCoffee.getText())
                    && Integer.valueOf(txtNumCoffee.getText()) >= 0) {
                txtNumCoffee.setText(Integer.valueOf(txtNumCoffee.getText()) + 1 + "");
            } else {
                txtNumCoffee.requestFocus();
            }
        } else {
            if (!txtNumCoffee.getText().isEmpty() && isNumeric(txtNumCoffee.getText())
                    && Integer.valueOf(txtNumCoffee.getText()) > 0) {
                total += Integer.valueOf(txtNumCoffee.getText()) * 3.50;
                data = "Iced Coffee:\t\t" + txtNumCoffee.getText() + " items will cost $" + (Integer.valueOf(txtNumCoffee.getText()) * 3.50);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumCoffee.requestFocus();
            }
        }
    }

    @FXML
    void enterCoke(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumCoke.getText().isEmpty() && isNumeric(txtNumCoke.getText())
                    && Integer.valueOf(txtNumCoke.getText()) > 0) {
                txtNumCoke.setText(Integer.valueOf(txtNumCoke.getText()) - 1 + "");
            } else {
                txtNumCoke.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumCoke.getText().isEmpty() && isNumeric(txtNumCoke.getText())
                    && Integer.valueOf(txtNumCoke.getText()) >= 0) {
                txtNumCoke.setText(Integer.valueOf(txtNumCoke.getText()) + 1 + "");
            } else {
                txtNumCoke.requestFocus();
            }
        } else {
            if (!txtNumCoke.getText().isEmpty() && isNumeric(txtNumCoke.getText())
                    && Integer.valueOf(txtNumCoke.getText()) > 0) {
                total += Integer.valueOf(txtNumCoke.getText()) * 2.00;
                data = "Coke:\t\t\t" + txtNumCoke.getText() + " items will cost $" + (Integer.valueOf(txtNumCoke.getText()) * 2.00);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumCoke.requestFocus();
            }
        }
    }

    @FXML
    void enterLemonade(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumLemonade.getText().isEmpty() && isNumeric(txtNumLemonade.getText())
                    && Integer.valueOf(txtNumLemonade.getText()) > 0) {
                txtNumLemonade.setText(Integer.valueOf(txtNumLemonade.getText()) - 1 + "");
            } else {
                txtNumLemonade.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumLemonade.getText().isEmpty() && isNumeric(txtNumLemonade.getText())
                    && Integer.valueOf(txtNumLemonade.getText()) >= 0) {
                txtNumLemonade.setText(Integer.valueOf(txtNumLemonade.getText()) + 1 + "");
            } else {
                txtNumLemonade.requestFocus();
            }
        } else {
            if (!txtNumLemonade.getText().isEmpty() && isNumeric(txtNumLemonade.getText())
                    && Integer.valueOf(txtNumLemonade.getText()) > 0) {
                total += Integer.valueOf(txtNumLemonade.getText()) * 4.00;
                data = "Lemonade:\t\t" + txtNumLemonade.getText() + " items will cost $" + (Integer.valueOf(txtNumLemonade.getText()) * 4.00);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumLemonade.requestFocus();
            }
        }
    }

    @FXML
    void enterWater(MouseEvent e) throws IOException {
        Button btn = (Button) e.getSource();
        if (btn.getText().equals("-")) {
            if (!txtNumWater.getText().isEmpty() && isNumeric(txtNumWater.getText())
                    && Integer.valueOf(txtNumWater.getText()) > 0) {
                txtNumWater.setText(Integer.valueOf(txtNumWater.getText()) - 1 + "");
            } else {
                txtNumWater.requestFocus();
            }
        } else if (btn.getText().equals("+")) {
            if (!txtNumWater.getText().isEmpty() && isNumeric(txtNumWater.getText())
                    && Integer.valueOf(txtNumWater.getText()) >= 0) {
                txtNumWater.setText(Integer.valueOf(txtNumWater.getText()) + 1 + "");
            } else {
                txtNumWater.requestFocus();
            }
        } else {
            if (!txtNumWater.getText().isEmpty() && isNumeric(txtNumWater.getText())
                    && Integer.valueOf(txtNumWater.getText()) > 0) {
                total += Integer.valueOf(txtNumWater.getText()) * 0.60;
                data = "Water:\t\t\t" + txtNumWater.getText() + " items will cost $" + (Integer.valueOf(txtNumWater.getText()) * 0.60);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            } else {
                txtNumWater.requestFocus();
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
