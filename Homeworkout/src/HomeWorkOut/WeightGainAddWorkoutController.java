package HomeWorkOut;

import static HomeWorkOut.LoginAndSignUpController.loginInfoBox;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.ConnectionUtil;

/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */
public class WeightGainAddWorkoutController implements Initializable {

    Stage dialogStage = new Stage();
    Scene scene;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    
    //Input Fields in fxml
    @FXML public TextField workoutName;
    @FXML public TextField repsNumber;
    @FXML public TextField setsNumber;
    
    //database connection in constructor
    public WeightGainAddWorkoutController(){
        connection = ConnectionUtil.connectdb();
    }
    
    //add method to insert add textfields' values into database
    public void addWorkout(ActionEvent event){
        //initializing local string variables in add method
        String woName = workoutName.getText();
        String rNumber = repsNumber.getText();
        String sNumber = setsNumber.getText();
        String sql = "INSERT INTO weightgain(workout, reps, sets) VALUES (?,?,?);";
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, woName);
            preparedStatement.setString(2, rNumber);
            preparedStatement.setString(3, sNumber);
            preparedStatement.executeUpdate();
            
            addInfoBox("Add successful", null, "Success");
            Node node = (Node)event.getSource();
            dialogStage = (Stage) node.getScene().getWindow();
            dialogStage.close();
            scene = new Scene(FXMLLoader.load(getClass().getResource("WG.fxml")));
            dialogStage.setScene(scene);
            dialogStage.show();
        }
        catch(Exception e){
            addInfoBox("Add not successful", null, "Failed");
        }
    }
    
    //sign up alert box after add attempt
    public static void addInfoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO Code
    }   
    
}
