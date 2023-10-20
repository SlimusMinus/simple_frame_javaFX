package com.example.study_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;

public class HelloController {
    @FXML
    TextField pathid;
    ObservableList<String> str = FXCollections.observableArrayList();
    @FXML
    ListView<String> listId;
    @FXML
    private Button btn;

    @FXML
    public void btnCancelClick(ActionEvent event) {
        str.clear();
    }
    @FXML
    public void btnFindClick(ActionEvent event) {
        File file = new File(pathid.getText());
        for (var item : file.listFiles())
            str.add(item.getName());
        listId.setItems(str);
    }


}