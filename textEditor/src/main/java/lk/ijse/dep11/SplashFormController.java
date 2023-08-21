package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashFormController {
    public Label lblLoad;

    public void initialize() {
        Timeline timeline = new Timeline();
        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(500), event ->{
            lblLoad.setText("Application is being initialized...");
        });

        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(1500), event -> {
            lblLoad.setText("Setting up Tools...");
        });

        KeyFrame keyFrame3 = new KeyFrame(Duration.millis(2500), event -> {
            lblLoad.setText("Setting up UI...");
        });

        KeyFrame keyFrame4 = new KeyFrame(Duration.millis(3000), event -> {
            try {
                AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
                Scene MainScene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(MainScene);
                stage.setTitle("Untitled");
                stage.show();
                stage.centerOnScreen();
                lblLoad.getScene().getWindow().hide();

                FadeTransition fade = new FadeTransition(Duration.millis(500),root);
                fade.setFromValue(0);
                fade.setToValue(1);
                fade.playFromStart();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            URL fxmlFile = getClass().getResource("/view/MainForm.fxml");
//            FXMLLoader fxmlLoader = new FXMLLoader(fxmlFile);
//            try {
//                AnchorPane root = fxmlLoader.load();
//                Scene scene = new Scene(root);
//                Stage stage = new Stage();
//
//                MainFormController controller = fxmlLoader.getController();
//                controller.(stage);
//
//                stage.setScene(scene);
//                stage.setTitle("Untitled Document");
//                stage.show();
//                stage.centerOnScreen();
//                lblLoad.getScene().getWindow().hide();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        });
        timeline.getKeyFrames().addAll(keyFrame1, keyFrame2, keyFrame3, keyFrame4);
        timeline.playFromStart();
    }

}
