package lk.ijse.dep11;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AboutFormController {
    public AnchorPane root;
    private double Xcordinate=0;
    private double Ycordinate=0;

    public void initialize(){
        root.setOnMousePressed(this::rootMousePressed);
        root.setOnMouseDragged(this::rootMouseDraggedAction);
    }

    public void rootMouseDraggedAction(MouseEvent mouseEvent) {
        Stage stage = (Stage)root.getScene().getWindow();
        stage.setX(mouseEvent.getScreenX()-Xcordinate);
        stage.setY(mouseEvent.getScreenY()-Ycordinate);

    }

    public void rootMousePressed(MouseEvent mouseEvent) {
        Xcordinate=mouseEvent.getX();
        Ycordinate=mouseEvent.getY();
    }
}
