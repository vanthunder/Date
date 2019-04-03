package application;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
 
public class SampleController implements Initializable {
 
   private int counter;
   private int value = 0;
	
   @FXML
   private Button DateButton;
  
   @FXML
   private TextField TextField;
   
  
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   public void showDate(ActionEvent event) {
       System.out.println("Button Clicked!");
      
       Date now= new Date();
      
       DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
      
      
        // Model Data
        String dateTimeString = df.format(now);
        
        
        if(counter == 0 )
        {
        // Show in VIEW
        TextField.setAlignment(Pos.CENTER);
        TextField.setText(dateTimeString);
        counter++;
        }
        else
        if(counter >= 0)
        {
        TextField.setAlignment(Pos.CENTER);
        TextField.setText("Das Datum wurde bereits eingetragen!");
        counter=0;
        }
   }
  
}