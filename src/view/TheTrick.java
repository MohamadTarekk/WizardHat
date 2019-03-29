package view;

import controller.SortVisualFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import view.visualization.BubbleSortVisual;
import view.visualization.SortVisual;

import java.net.URL;
import java.util.ResourceBundle;

public class TheTrick implements Initializable {

    private SortVisual sortVisual = new BubbleSortVisual(500, 300);
    ///////////////////////////////////////
    @FXML
    private GridPane pane;
    @FXML
    private ComboBox<String> techniqueCmb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeComboBox();
    }

    private void initializeComboBox() {
        techniqueCmb.getItems().addAll("Bubble Sort", "Selection Sort", "Insertion Sort", "Heap Sort", "Merge Sort", "Quick Sort");
        techniqueCmb.getSelectionModel().selectFirst();
        techniqueCmb.valueProperty().addListener((ov, t, t1) -> sortVisual = SortVisualFactory.createNewSort(500, 300, techniqueCmb.getValue()));
        pane.add(sortVisual, 1, 1);
    }
}