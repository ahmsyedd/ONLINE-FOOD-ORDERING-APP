import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CheckoutController {

    @FXML
    private Button btnHome;
    @FXML
    private Button btnOrder;
    @FXML
    private Label lblTotal;
    @FXML
    private TextArea txtSummary;

    File file = new File("OrderData.txt");
    LineNumberReader lnReader = null;
    BufferedWriter bw;

    String[] line;
    String finalLine = "";
    String s = "";
    float amount;


    public void initialize() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        line = new String[100];
        String s = "";
        int count = 0;

        try {
            do {
                line[count] = s;
                count++;

            } while ((s = bReader.readLine()) != null);

            for (int i = 0; i < count; i++) {
                finalLine += line[i] + "\n";
            }

            txtSummary.setText(finalLine);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void backHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root2 = loader.load();
        HomeController homeWindowController = loader.getController();
        Stage stage = new Stage();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
        homeWindowController.homeTotal(amount);
        Stage oldStage = (Stage) btnHome.getScene().getWindow();
        oldStage.close();
    }

    @FXML
    void order(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ThankPage.fxml"));
        Parent root2 = loader.load();
        ThankController secondWindowController = loader.getController();
        Stage stage = new Stage();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
        PrintWriter writer = new PrintWriter("OrderData.txt");
        writer.print("");
        writer.close();
        Stage oldStage = (Stage) btnOrder.getScene().getWindow();
        oldStage.close();
    }

    public void checkoutTotal(float total) {
        amount += total;
        float taxes = amount * 0.13f;

        lblTotal.setText("Sub-Total: $" + amount + "\nTaxes: $" + taxes +
                "\nTotal: $" + (amount + taxes));
    }

}
