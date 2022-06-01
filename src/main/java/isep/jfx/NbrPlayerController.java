package isep.jfx;

import isep.ricrob.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class NbrPlayerController {
    public int nbrplayer;
    @FXML
    TextField nbrTextField;

    @FXML
    public void initialize() {

    }

    @FXML
    public void confirm(ActionEvent actionEvent) throws IOException {
        String variable = nbrTextField.getText();
        if ( nbrTextField !=null &&
                        (!nbrTextField.getText().isBlank())
        ) {
            if(variable=="1"){nbrplayer=1;
                Node node = (Node) actionEvent.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader
                        (MainApplication.class.getResource("player-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();}
            if(nbrTextField.getText()=="2"){nbrplayer=2;
                Node node = (Node) actionEvent.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader
                        (MainApplication.class.getResource("player-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();}
            if(nbrTextField.getText()=="3"){nbrplayer=3;
                Node node = (Node) actionEvent.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader
                        (MainApplication.class.getResource("player-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();}
            if(nbrTextField.getText()=="4"){nbrplayer=4;
                Node node = (Node) actionEvent.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader
                        (MainApplication.class.getResource("player-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();}

        }
    }

}
