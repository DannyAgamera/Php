/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWorkOut;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */
public class MainHomeController implements Initializable {
    Stage dialogStage = new Stage();
    Scene scene;
    
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
    
    //signUpScene method to go to signup in form scene
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
