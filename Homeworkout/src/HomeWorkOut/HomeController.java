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
public class HomeController implements Initializable {

    Stage dialogStage = new Stage();
    Scene scene;
    
    //logOut method to go to log in form scene
    public void logOut(ActionEvent event){
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
    
    //method to go to weight gain
    public void weightGainScene(ActionEvent event){
        try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("WG.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
    
    //method to go to weight loss
    public void weightLossScene(ActionEvent event){
        try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("WL.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
        
        
    }
    
    //dietScene method to go to diet scene
    public void dietScene(ActionEvent event){
        try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("Diet.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
