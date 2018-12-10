package HomeWorkOut;

import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import util.ConnectionUtil;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */

public class LoginAndSignUpController implements Initializable {
    
    //Input Fields in Login.fxml
    @FXML public TextField loginUserName;
    @FXML public PasswordField loginPassword;
    
    //Input Fields in SignUp.fxml
    @FXML public TextField signUpUserName;
    @FXML public TextField signUpPhoneNumber;
    @FXML public TextField signUpEmail;
    @FXML public PasswordField signUpPassword;
    @FXML public PasswordField signUpRepeatPassword;
    
    Stage dialogStage = new Stage();
    Scene scene;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
   
    //Connects the connectdb method in ConnectionUtil class in util package
    public LoginAndSignUpController(){
        connection = ConnectionUtil.connectdb();
    }
    
    //signUp method to insert sign up textfields' values into database
    public void signUp(ActionEvent event){
        //initializing local string variables in signUp method
        String userName = signUpUserName.getText();
        String phoneNumber = signUpPhoneNumber.getText();
        String email = signUpEmail.getText();
        String password = signUpPassword.getText();
        String repeatPassword = signUpRepeatPassword.getText();
        String sql = "INSERT INTO Users(username,phonenumber,email,password,repeatpassword) VALUES (?,?,?,?,?);";
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, phoneNumber);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, repeatPassword);
            preparedStatement.executeUpdate();
            
            signupInfoBox("Sign up successful", null, "Success");
            Node node = (Node)event.getSource();
            dialogStage = (Stage) node.getScene().getWindow();
            dialogStage.close();
            scene = new Scene(FXMLLoader.load(getClass().getResource("Login.fxml")));
            dialogStage.setScene(scene);
            dialogStage.show();
        }
        catch(Exception e){
            signupInfoBox("Sign up not successful", null, "Failed");
        }
    }
    
    //sign up alert box after sign up attempt
    public static void signupInfoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
    
        //Login method that also connects to database
    public void logIn(ActionEvent event){
        String email = loginUserName.getText().toString();
        String password = loginPassword.getText().toString();
        String sql = "SELECT * FROM Users WHERE email = ? and password = ?";
        
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            
            if(!resultSet.next()){
                loginInfoBox("Please enter correct Email and Password", null, "Failed");
            }
            else{
                loginInfoBox("Login Successful", null, "Success");
                Node node = (Node)event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                scene = new Scene(FXMLLoader.load(getClass().getResource("Home.fxml")));
                dialogStage.setScene(scene);
                dialogStage.show();
               
            }
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
    
    //Login information alert method after a login attempt 
    public static void loginInfoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }

    //signUpScene method to go to sign up scene
    public void signUpScene(ActionEvent event){
       try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("SignUp.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }

    }
    
    //logInScene method to go to log in form scene
    public void logInScene(ActionEvent event){
        try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("Login.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
    
    //home scene method
    public void homeScene(ActionEvent event){
       try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("MainHome.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
