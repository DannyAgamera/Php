/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWorkOut;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */
public class OpeningScreenController implements Initializable {
    
    @FXML public AnchorPane mainPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        new OpeningScreen().start();
    }    
    
    //Thread to add a sleep
    class OpeningScreen extends Thread{
        public void run(){
            try {
                Thread.sleep(5000);
                
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        
                
                Parent root = null; 
                        try {
                            root = FXMLLoader.load(getClass().getResource("MainHome.fxml")); //setting the fxml scene to load on running
                        } catch (IOException ex) {
                            Logger.getLogger(OpeningScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
        
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                mainPane.getScene().getWindow().hide();
                    }  });
            } catch (InterruptedException ex) {
                Logger.getLogger(OpeningScreenController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
}
