package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;
    public MenuItem itmFileNew;
    public MenuItem itmFileOpen;
    public MenuItem itmFileSave;
    public MenuItem itmFileSaveAs;
    public MenuItem itmFilePrint;
    public MenuItem itmFileExit;
    public MenuItem itmEditCut;
    public MenuItem itmEditCopy;
    public MenuItem itmEditPaste;
    public MenuItem itmEditSelectAll;
    public MenuItem itmHelpUserGuide;
    public MenuItem itmHelpAbout;

    public void itmFileNewOnAction(ActionEvent actionEvent) {
    }

    public void itmFileExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void itmHelpUserGuideOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane root1 = FXMLLoader.load(getClass().getResource("/view/UserGuideForm.fxml"));
        Scene scene1 = new Scene(root1);

        Stage stage = new Stage();

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(scene1);
        stage.setTitle("User Guide ");
        stage.show();

    }

    public void itmHelpAboutOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane root1 = FXMLLoader.load(getClass().getResource("/view/AboutForm.fxml"));
        Scene scene1 = new Scene(root1);

        Stage stage = new Stage();

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(scene1);
        stage.setTitle("About Us ");
        stage.show();
    }
}
