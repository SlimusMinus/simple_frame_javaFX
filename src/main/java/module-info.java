module com.example.study_javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.study_javafx to javafx.fxml;
    exports com.example.study_javafx;
}