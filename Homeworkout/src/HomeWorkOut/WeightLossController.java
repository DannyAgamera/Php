package HomeWorkOut;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import util.ConnectionUtil;

/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */
public class WeightLossController implements Initializable {
    @FXML private TableView<WeightLossModelTable> table;
    @FXML private TableColumn<WeightLossModelTable, String> workoutNameColumn;
    @FXML private TableColumn<WeightLossModelTable, String> repsColumn;
    @FXML private TableColumn<WeightLossModelTable, String> setsColumn;
    
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
    
    //home scene method
    public void homeScene(ActionEvent event){
       try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("Home.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
    
    //add scene method
    public void addWorkout(ActionEvent event){
       try{
        Node node = (Node)event.getSource();
        dialogStage = (Stage) node.getScene().getWindow();
        dialogStage.close();
        scene = new Scene(FXMLLoader.load(getClass().getResource("WeightLossAddWorkout.fxml")));
        dialogStage.setScene(scene);
        dialogStage.show();
        }
        catch(Exception e){
            
        }
    }
    
    ObservableList<WeightLossModelTable> obList = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            Connection conn = ConnectionUtil.connectdb();
            
            ResultSet rs = conn.createStatement().executeQuery("select * from weightloss");
            
            while(rs.next()){
                obList.add(new WeightLossModelTable(rs.getString("workout"), rs.getString("reps"), rs.getString("sets")));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
        workoutNameColumn.setCellValueFactory(new PropertyValueFactory<>("workout"));
        repsColumn.setCellValueFactory(new PropertyValueFactory<>("reps"));
        setsColumn.setCellValueFactory(new PropertyValueFactory<>("sets"));
        
        table.setItems(obList);
        
    }
    public void dell(){
        ObservableList<WeightLossModelTable> pSel,allP;
        allP = table.getItems();
        pSel = table.getSelectionModel().getSelectedItems();
        pSel.forEach(allP::remove);
        
    }
    
}
